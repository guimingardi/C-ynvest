package br.com.illumy.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada com sucesso!");
        connection.close();
	}

}

