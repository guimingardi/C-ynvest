
package com.mycompany.illumy.oshi;

import org.springframework.jdbc.core.JdbcTemplate;


public class InsertRam {
    
    protected String disponivel;
    protected String total;

    public InsertRam(String disponivel, String total) {
    this.disponivel = disponivel;                
    this.total = total;                              
    }

    public void InsertRam() {
        
        ConnectionFactory dadosConexao = new ConnectionFactory();
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dadosConexao.getDataSource());
   
        try {
           jdbcTemplate.update(
                "insert into memoriaRam (espacoLivreGB, memoriaTotalGB)"
                + "values(?,?)", disponivel, total);
             
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
    }  
    
}
