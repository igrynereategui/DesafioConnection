package br.com.fiap.desafioconnection.testes;

import javax.persistence.Persistence;

public class ConexaoBanco {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("desafioconnection-orm").createEntityManager();
	}
}