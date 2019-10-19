
package com.mycompany.illumy.oshi;

import org.springframework.jdbc.core.JdbcTemplate;


public class InsertDisco {
    
    protected String disponivel;
    protected String total;

    public InsertDisco(String disponivel, String total) {
    this.disponivel = disponivel;                
    this.total = total;                              
    }

    public void InsertDisco() {
        
        ConnectionFactory dadosConexao = new ConnectionFactory();
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dadosConexao.getDataSource());
   
        try {
           jdbcTemplate.update(
                "insert into disco (tamanhoTotalGB, espacoLivreGB)"
                + "values(?,?)", total, disponivel);
             
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
    }  
    
}
