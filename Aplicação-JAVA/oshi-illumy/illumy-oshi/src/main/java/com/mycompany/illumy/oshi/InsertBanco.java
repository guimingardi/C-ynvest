
package com.mycompany.illumy.oshi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;


public class InsertBanco {
    
    public static void main(String[] args) throws SQLException {


        try (Connection con = new ConnectionFactory().getConnection()) {
        	
            Random dados = new Random();
            Integer cpu = dados.nextInt(150)+1;
            
           
            String sql = "insert into CPU" +
                    " (tempCPU,modProcessador)" +
                    " values (?,?)";
            try {
                
                try (PreparedStatement stmt = con.prepareStatement(sql)) {
                    stmt.setInt(1, cpu);
                    stmt.setString(2, "Intel I7");                    
                    
                    stmt.execute();
                }
                
            }
            catch (SQLException e) {
                
                throw new RuntimeException(e);
            }
            System.out.println("Dados Gravados!");
        
        }    }
    
}
