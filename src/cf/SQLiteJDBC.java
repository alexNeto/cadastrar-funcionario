package cf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteJDBC{

	public static void criaTabela(){
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:funcionario.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIO " +
	                   "(ID INT PRIMARY KEY   	NOT NULL," +
	                   " NOME           TEXT    NOT NULL, " + 
	                   " EMAIL			TEXT	NOT NULL, " +
	                   " CARGO			TEXT	NOT NULL, " +
	                   " SENHA			TEXT	NOT NULL) "; 
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch (Exception e) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	  }

	public static void gravaDados(int id, String nome, String email, Cargos cargo, String senha){
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:funcionario.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "INSERT INTO FUNCIONARIO (ID, NOME, EMAIL, CARGO, SENHA) " +
	                   "VALUES (" + id + ", '" + nome + "', '" + email + "', '" + cargo + "', '" + senha + "');"; 
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }

	public static int ultimoId(){
		int id = 0;
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:funcionario.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT MAX(ID) FROM FUNCIONARIO;" );
	      id = rs.getInt(1);
	      
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return id;
	  }
	
	public static void atualizaDB(int id, String nome, String email, Cargos cargo, String senha){
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      
	      String sql = "UPDATE FUNCIONARIO SET NOME = "+ nome +
	    		  ", EMAIL = " + email +
	    		  ", CARGO = " + cargo + 
	    		  ", SENHA = " + senha +
	    		  " where ID =" + id + ";";
	      
	      stmt.executeUpdate(sql);
	      c.commit();
	      c.close();
	    	} catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	  }

	public static ResultSet consultarDados(boolean imprimir){
		
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:funcionario.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM FUNCIONARIO WHERE NOME = " + procura +
	    		  " OR  EMAIL = " + procura +";" );
	      if(imprimir){
	      while ( rs.next() ) {
	    	  int id = rs.getInt("ID");
	    	  String nome = rs.getString("NOME");
	    	  String email  = rs.getString("EMAIL");
	    	  String cargo = rs.getString("CARGO");
	    	  String senha = rs.getString("SENHA");
	    	  
	    	  
	    	  System.out.println( "ID = " + id );
	    	  System.out.println( "NAME = " + nome );
	    	  System.out.println( "AGE = " + email );
	    	  System.out.println( "ADDRESS = " + cargo );
	    	  System.out.println();
	      	}
	      }
	      else
	    	  return rs;
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
		return null;
	  }
}
	
