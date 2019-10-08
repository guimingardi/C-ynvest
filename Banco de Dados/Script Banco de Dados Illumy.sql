create database Illumy
go

use illumy
go


-- CRIA플O DA TABELA ASSINATURA

 create table assinatura (
idAssinatura int primary key identity (2000,4),
codLicenca int,
dataVencimento date
)

 -- CRIA플O DA TABELA EMPRESA
 
 create table empresa(
 idConta int primary key identity (1000,4),
 nomeUsuario varchar (45),
 senha varchar(20),
 telefone varchar(18),
 nomeEmpresa varchar(45),
 endereco varchar(45),
 cep varchar (10),
 bairro varchar (45),
 numEmpresa int,
 fkAssinatura int,
 foreign key (fkAssinatura) references assinatura (idAssinatura)
)


 
--CRIA플O DA TABELA USUARIO 
 
 create table usuario (
 idLogin int primary key identity(3000,4),
 nomeUser varchar(45),
 senha varchar(45),
 email varchar(45),
 fkConta int,
 foreign key (fkConta) references empresa (idConta),
 fkAssinatura int,
  foreign key (fkAssinatura) references assinatura (idAssinatura)
 );

 --CRIA플O DA TABELA SERVIDORES

 create table servidores (
 idServidor int primary key identity(3000,4),
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
 idCPU int primary key identity(4000,4),
 tempCPU varchar(8),
 modProcessador varchar(45),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor)
 )

 --CRIA플O DA TABELA DISCO

 create table disco(
 idDisco int primary key identity (5000,4),
 tamanhoUsadoGB decimal(6,2),
 tamanhoTotalGB decimal(6,2),
 espacoLivreGB decimal (6,2),
 tamanhoUsadoPorcentagem varchar(10),
 tamanhoTotalPorcentagem varchar(10),
 espacoLivrePorcentagem varchar(10),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor)
 )

 --CRIA플O DA TABELA MEMORIARAM

 create table memoriaRam (
 idRAM int primary key identity (6000,4),
 memoriaUsadaGB decimal(6,2),
 memoriaTotalGB decimal(6,2),
 espacoLivreGB decimal (6,2),
 memoriaUsadaPorcentagem varchar (10),
 memoriaTotalPorcentagem varchar (10),
 espacoLivrePorcentagem varchar(10),
 fkServidor int,
 foreign key (fkServidor) references servidores (idServidor)
 )



 