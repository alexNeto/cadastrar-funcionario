package com.cf.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Control implements MysqlConfig {

	public Connection getConexao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try  {
			Connection conn = DriverManager.getConnection(URL, UN, PW);
			return conn;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return null;
	}

}
