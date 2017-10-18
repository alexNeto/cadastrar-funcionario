package com.cf.bd.crud;

import java.sql.Connection;
import java.sql.Statement;

import com.cf.bd.Control;

public class Create {

	public void criaFuncionarios() {
		try (Connection conexao = new Control().getConexao(); Statement stmt = conexao.createStatement();) {

			System.out.println("Opened database successfully");

			String sql = "CREATE TABLE IF NOT EXISTS funcionario " + 
			"(id INT UNSIGNED PRIMARY KEY NOT NULL," +
			"nome VARCHAR(255) NOT NULL, " + 
			"email VARCHAR(255) NOT NULL, " +
			"cargo VARCHAR(255) NOT NULL, " + 
			"senha VARCHAR(255) NOT NULL) ";
			stmt.executeUpdate(sql);
			System.out.println("tabela criada com sucesso");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}

}
