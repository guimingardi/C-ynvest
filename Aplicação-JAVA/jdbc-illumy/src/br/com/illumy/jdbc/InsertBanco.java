package br.com.illumy.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class InsertBanco {
	

	public static void main(String[] args) throws SQLException {


        Connection con = new ConnectionFactory().getConnection();
        Random dados = new Random();

       Integer cpu = dados.nextInt(100)+1;
       Integer ram = dados.nextInt(100)+1;
       Integer dsc = dados.nextInt(100)+1;
        
        String sql = "insert into monitoramento_teste" +
                " (dadosCPU,dadosRAM,dadosDISCO)" +
                " values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);


        stmt.setInt(1, cpu);
        stmt.setInt(2, ram);
        stmt.setInt(3, dsc);

        stmt.execute();
        stmt.close();

        System.out.println("Dados Gravados!");

        con.close();
    }
}