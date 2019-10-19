create database Illumy
go

use illumy
go

 -- CRIA플O DA TABELA EMPRESA
 
 create table empresa(
 idConta int not null primary key identity (1,1),
 nomeUsuario varchar (45) not null,
 senha varchar(20) not null,
 telefone varchar(18) not null,
 nomeEmpresa varchar(45) not null,
 email varchar(50) not null,
 endereco varchar(45) not null,
 cep varchar (10) not null,
 bairro varchar (45) not null,
 numEmpresa int not null,
 )


-- CRIA플O DA TABELA ASSINATURA

 create table assinatura (
idAssinatura int identity (1,1),
codLicenca int,
dataVencimento date,
fkEmpresa int,
 foreign key (fkEmpresa) references empresa (idConta),
 primary key (fkEmpresa,idAssinatura)
)

--CRIA플O DA TABELA USUARIO 
 
 create table usuario (
 idLogin int primary key identity(1,1),
 nomeUser varchar(45),
 senha varchar(45),
 email varchar(45),
 fkConta int,
 foreign key (fkConta) references empresa (idConta),
 fkAssinatura int
 )

 --CRIA플O DA TABELA SERVIDORES

 create table servidores (
 idServidor int primary key identity(1,1),
 nomeServidor varchar (45),
 sistemaOperacional varchar(45),
 )

 --CRIA플O DA TABELA ASSOCIATIVA
 
 create table servidorUsuario (
 permissaoAcesso int,
 fkLogin int,
 foreign key (fkLogin) references usuario(idLogin),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor),
 primary key (fkLogin,fkServidor)
 )
 --CRIA플O DA TABELA CPU

 create table CPU (
 idCPU int identity(4000,4),
 tempCPU varchar(8),
 modProcessador varchar(45),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor),
 primary key (idCPU,fkServidor)
 )

 --CRIA플O DA TABELA DISCO

 create table disco(
 idDisco int identity (5000,4),
 tamanhoUsadoGB decimal(6,2),
 tamanhoTotalGB decimal(6,2),
 espacoLivreGB decimal (6,2),
 tamanhoUsadoPorcentagem varchar(10),
 tamanhoTotalPorcentagem varchar(10),
 espacoLivrePorcentagem varchar(10),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor),
 primary key (idDisco,fkServidor)
 )

 --CRIA플O DA TABELA MEMORIA RAM

 create table memoriaRam (
 idRAM int identity (6000,4),
 memoriaUsadaGB decimal(6,2),
 memoriaTotalGB decimal(6,2),
 espacoLivreGB decimal (6,2),
 memoriaUsadaPorcentagem varchar (10),
 memoriaTotalPorcentagem varchar (10),
 espacoLivrePorcentagem varchar(10),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor),
 primary key (idRAM,fkServidor)
 )



 