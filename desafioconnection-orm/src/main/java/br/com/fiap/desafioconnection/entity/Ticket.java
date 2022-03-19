package br.com.fiap.desafioconnection.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tb_ticket")
public class Ticket {
	
	
	@Id
	@SequenceGenerator(name = "ticket", sequenceName = "sq_t_ticket", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket")
	@Column(name = "id_ticket", nullable = false, length = 10)
	int idTicket;
	
	@Column(name = "dt_ticket", nullable = false)
	String dtTicket;

	@OneToOne
	@JoinColumn(name = "id_client")
	private Client idTicketClient;

	@OneToMany(mappedBy = "ticket")
	private Collection<Product> products;


	public Ticket() {
		super();
	}


	public Ticket(int idTicket, String dtTicket, Client idTicketClient, Collection<Product> products) {
		super();
		this.idTicket = idTicket;
		this.dtTicket = dtTicket;
		this.idTicketClient = idTicketClient;
		this.products = products;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public String getDtTicket() {
		return dtTicket;
	}

	public void setDtTicket(String dtTicket) {
		this.dtTicket = dtTicket;
	}

	public Client getIdTicketClient() {
		return idTicketClient;
	}

	public void setIdTicketClient(Client idTicketClient) {
		this.idTicketClient = idTicketClient;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}



}
