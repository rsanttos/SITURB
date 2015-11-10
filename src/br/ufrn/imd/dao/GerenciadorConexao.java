package br.ufrn.imd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorConexao {
	
	private static String DB_URL="jdbc:postgresql://localhost/SITURB_JSF";
	private static String DB_USER="ramon";
	private static String DB_PASS="ramon";
	private static Connection conexao;
	
	public static Connection getConnection() throws SQLException {
		if(conexao == null){
			conexao = fazerConexao();
		}
		return conexao;
	}
	
	private static Connection fazerConexao() throws SQLException{
		try{
			conexao = DriverManager.getConnection(DB_URL, DB_USER,DB_PASS);
			System.out.println("Banco conectado!!!");
		} catch (SQLException e){
			System.out.println("Erro de conexão!!!!");	
		}
		return conexao;
	}
	
private static void fecharConexao() throws SQLException {
		conexao.close();
	}	
	
}