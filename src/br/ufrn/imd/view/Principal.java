package br.ufrn.imd.view;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufrn.imd.dao.GerenciadorConexao;

public class Principal {
	public static void main(String[] args) throws SQLException {
		//Connection conn = GerenciadorConexao.getConnection();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SITURB");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
	}
}
