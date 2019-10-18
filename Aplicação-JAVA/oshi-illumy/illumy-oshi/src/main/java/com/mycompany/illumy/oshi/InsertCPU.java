
package com.mycompany.illumy.oshi;

import org.springframework.jdbc.core.JdbcTemplate;



public class InsertCPU {
    
    protected String usoCpu;

    public InsertCPU(String usoCpu) {
    this.usoCpu = usoCpu;                
    }

    public void insertCpu() {
        
        ConnectionFactory dadosConexao = new ConnectionFactory();
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dadosConexao.getDataSource());
   
        try {
           jdbcTemplate.update(
                "insert into CPU (utilizacao_atual)"
                + "values(?)", usoCpu);
             
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
    }
}
            

