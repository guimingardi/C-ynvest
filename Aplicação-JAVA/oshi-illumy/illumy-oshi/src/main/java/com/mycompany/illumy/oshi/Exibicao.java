package com.mycompany.illumy.oshi;

public class Exibicao {
    
    private final Processador processador;
    private final Memoria memoria;
    private final SistemaOperacional sistemaOperacional;

    public Exibicao() {
        processador = new Processador();
        memoria = new Memoria();
        sistemaOperacional = new SistemaOperacional();
    }
    
    public void getDados(){
        
    }
    
}
