package com.cf;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.cf.bd.Control;
import com.cf.bd.Model;

public class Main {

	public static void main(String[] args) throws SQLException {


		/*
		 * Connection con = new Control().getConexao();
		 * 
		 * // cria um preparedStatement String sql = "insert into contatos" +
		 * " (nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";
		 * PreparedStatement stmt = con.prepareStatement(sql);
		 * 
		 * // preenche os valor es stmt.setString(1, "Caelum"); stmt.setString(2,
		 * "contato@caelum.com.br"); stmt.setString(3, "R. Vergueiro 3185 cj57");
		 * stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		 * 
		 * // executa stmt.execute(); stmt.close();
		 * 
		 * System.out.println("Gravado!");
		 * 
		 * con.close();
		 */
		new Model().criaTabela();
	}
	/*
	 * System.out.println("-------- MySQL JDBC Connection Testing ------------");
	 * 
	 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException
	 * e) { System.out.println("Where is your MySQL JDBC Driver?");
	 * e.printStackTrace(); return; }
	 * 
	 * System.out.println("MySQL JDBC Driver Registered!"); Connection connection =
	 * null;
	 * 
	 * try { connection =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionarios",
	 * "nome", "g#)p-1Y!5");
	 * 
	 * } catch (SQLException e) {
	 * System.out.println("Connection Failed! Check output console");
	 * e.printStackTrace(); return; }
	 * 
	 * if (connection != null) {
	 * System.out.println("You made it, take control your database now!"); } else {
	 * System.out.println("Failed to make connection!"); }
	 */

}
