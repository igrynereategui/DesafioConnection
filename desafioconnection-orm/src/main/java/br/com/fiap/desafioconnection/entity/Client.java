package br.com.fiap.desafioconnection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client {
	
	@Id
	@SequenceGenerator(name = "client", sequenceName = "sq_t_client", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client")
	@Column(name = "id_client", nullable = false, length = 10)
	private int idClient;
	
	@Column(name = "nm_client", nullable = false, length = 30)
	private String nmClient;
	
	@Column(name = "phone_number", nullable = false, length = 15)
	private String phoneNumber;


	@OneToOne(mappedBy = "idTicketClient")
	private Ticket ticket;



	public Client() {
		super();
	}


	public Client(int idClient, String nmClient, String phoneNumber, Ticket ticket) {
		super();
		this.idClient = idClient;
		this.nmClient = nmClient;
		this.phoneNumber = phoneNumber;
		this.ticket = ticket;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getNmClient() {
		return nmClient;
	}


	public void setNmClient(String nmClient) {
		this.nmClient = nmClient;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}

	