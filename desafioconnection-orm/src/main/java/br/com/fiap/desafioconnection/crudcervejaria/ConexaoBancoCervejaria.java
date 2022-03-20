package br.com.fiap.desafioconnection.crudcervejaria;

import javax.persistence.Persistence;

public class ConexaoBancoCervejaria {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("desafioconnection-orm").createEntityManager();
	}
}