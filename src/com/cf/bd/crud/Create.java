package com.cf.bd.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.cf.Usuario;
import com.cf.bd.Control;

public class Create {

	public static void criaFuncionarios() {
		try (Connection conexao = new Control().getConexao(); Statement stmt = conexao.createStatement();) {

			System.out.println("Opened database successfully");

			String sql = "CREATE TABLE IF NOT EXISTS funcionario "
					+ "(id INT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT," + "nome VARCHAR(255) NOT NULL, "
					+ "email VARCHAR(255) NOT NULL, " + "cargo VARCHAR(255) NOT NULL, "
					+ "senha VARCHAR(255) NOT NULL) ";
			stmt.executeUpdate(sql);
			// para dev apenas
			System.out.println("tabela criada com sucesso");
		} catch (Exception e) {
			// para dev apenas
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}

	public void adicionaFuncionario(Usuario funcionario) {

		try (Connection conexao = new Control().getConexao()) {
			String sql = "insert into funcionario" + " (nome, email, cargo, senha)" + " values (?,?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getCargo());
			stmt.setString(4, funcionario.getSenha());

			stmt.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
