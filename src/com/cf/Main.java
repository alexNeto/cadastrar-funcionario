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

		new Model().criaTabela();
	}
}
