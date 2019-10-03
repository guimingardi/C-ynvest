package br.com.illumy.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectBanco {
	
    public static void main(String[] args) throws SQLException {
		
    Connection con = new ConnectionFactory().getConnection();
    PreparedStatement stmt = con.prepareStatement("select * from monitoramento_teste");


    ResultSet rs = stmt.executeQuery();
    


    while (rs.next()) {
    	String ev = rs.getString("IdLog");
        String cpu = rs.getString("DadosCPU");
        String ram = rs.getString("DadosRAM");
        String dsc = rs.getString("DadosDISCO");
        
        

        System.out.println("Evento = "+ev+" CPU = "+cpu+"%"+" RAM = "+ram+"%"+" DISCO = "+dsc+"%");
    }

    stmt.close();
    con.close();


}
}
