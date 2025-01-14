
package com.mycompany.illumy.oshi;

import org.springframework.jdbc.core.JdbcTemplate;


public class InsertRam {
    
    protected String disponivel;
    protected String total;
    protected String fkServidor;

    public InsertRam(String disponivel, String total) {
    this.disponivel = disponivel;                
    this.total = total;                              
    this.fkServidor = "12";                              
    }

    public void InsertRam() {
        
        ConnectionFactory dadosConexao = new ConnectionFactory();
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dadosConexao.getDataSource());
   
        try {
           jdbcTemplate.update(
                "insert into memoriaRam (espacoLivreGB, memoriaTotalGB, fkServidor)"
                + "values(?,?,?)", disponivel, total, fkServidor);
             
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
    }  
    
}
