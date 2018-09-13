package br.com.technocorp.connectionfactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteConnectionFactory {
	public static void main(String[] args) throws SQLException {
		Connection c = new ConnectionFactory().getConnection();
		
		PreparedStatement ps = c.prepareStatement("select * from tabela");
		// ...
	}
}
