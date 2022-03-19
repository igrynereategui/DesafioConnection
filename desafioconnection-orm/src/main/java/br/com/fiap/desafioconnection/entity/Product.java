package br.com.fiap.desafioconnection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@SequenceGenerator(name = "product", sequenceName = "sq_t_product", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product")
	@Column(name = "id_product", nullable = false, length = 10)
	int idProduct;
	
	@Column(name = "nm_product", nullable = false, length = 30)
	String nmProduct;
	
	@Column(name = "qt_product", nullable = false, length = 10)
	int qtProduct;
	
	@Column(name = "vl_product", nullable = false)
	double vlProduct;
	
	@Column(name = "vl_total", nullable = false)
	double vlTotal;

	@ManyToOne
	private Ticket ticket;


	public Product() {
		super();
	}


	public Product(int idProduct, String nmProduct, int qtProduct, double vlProduct, double vlTotal, Ticket ticket) {
		super();
		this.idProduct = idProduct;
		this.nmProduct = nmProduct;
		this.qtProduct = qtProduct;
		this.vlProduct = vlProduct;
		this.vlTotal = vlTotal;
		this.ticket = ticket;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNmProduct() {
		return nmProduct;
	}

	public void setNmProduct(String nmProduct) {
		this.nmProduct = nmProduct;
	}

	public int getQtProduct() {
		return qtProduct;
	}

	public void setQtProduct(int qtProduct) {
		this.qtProduct = qtProduct;
	}

	public double getVlProduct() {
		return vlProduct;
	}

	public void setVlProduct(double vlProduct) {
		this.vlProduct = vlProduct;
	}

	public double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	



}
