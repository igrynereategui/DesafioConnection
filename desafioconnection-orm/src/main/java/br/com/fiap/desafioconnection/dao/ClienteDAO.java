package br.com.fiap.desafioconnection.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.desafioconnection.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Integer>{
	
	public ClienteDAO(EntityManager em) {
		super(em);
	}
	
	
	
	
}
