package br.com.fiap.desafioconnection.dao;



import javax.persistence.EntityManager;

import br.com.fiap.desafioconnection.domain.Ticket;

public class TicketDAO extends GenericDAO<Ticket, String> {

	public TicketDAO(EntityManager em) {
		super(em);
	}



}


