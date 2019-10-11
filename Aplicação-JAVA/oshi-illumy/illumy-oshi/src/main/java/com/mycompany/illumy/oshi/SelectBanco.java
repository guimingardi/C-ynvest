
package com.mycompany.illumy.oshi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectBanco {
    
     public static void main(String[] args) throws SQLException {
			
             try (Connection con = new ConnectionFactory().getConnection();
                     PreparedStatement stmt = con.prepareStatement("select * from CPU")) {
                 
                 
                 
                 ResultSet rs = stmt.executeQuery();
                 
                 
                 
                 while (rs.next()) {
                     String cpu = rs.getString("tempCPU");
                     String modCPU = rs.getString("modProcessador");
                   
                     
                     
                     
                     System.out.println("Temperatura atual: "+cpu+"C°\n"+"Modelo"
                             + " processador: "+modCPU);
                 }
                 
             }


		}

    
}
