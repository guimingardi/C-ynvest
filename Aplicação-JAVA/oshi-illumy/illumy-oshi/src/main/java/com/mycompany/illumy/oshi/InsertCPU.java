
package com.mycompany.illumy.oshi;

import org.springframework.jdbc.core.JdbcTemplate;



public class InsertCPU {
    
    protected String usoCPU;
    protected String modCPU;
    protected String tempCPU;

    public InsertCPU(String usoCPU, String modCPU,String tempCPU) {
    this.usoCPU = usoCPU;                
    this.modCPU = modCPU;                
    this.tempCPU = tempCPU;                
    }

    public void insertCPU() {
        
        ConnectionFactory dadosConexao = new ConnectionFactory();
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dadosConexao.getDataSource());
   
        try {
           jdbcTemplate.update(
                "insert into CPU (utilizacao_atual, modProcessador, tempCPU)"
                + "values(?,?,?)", usoCPU, modCPU, tempCPU);
             
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
    }
}
            

