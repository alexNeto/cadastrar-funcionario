package com.cf.bd;

public interface MysqlConfig_exemplo {
	
	String HN = "127.0.0.1"; // endereço do servidor do banco de dados
	String DN = "exemplo"; // nome do banco de dados
	String URL = "jdbc:mysql://" + HN + "/" + DN;
	String UN = "usuario"; // Nome do usuário para o bando de dados
	String PS = "senha123"; // senha do banco de dados

}
