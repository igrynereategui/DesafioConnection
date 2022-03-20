package br.com.fiap.desafioconnection.crudcervejaria;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.desafioconnection.domain.Cliente;

public class AtualizarInfoCervejaria {
	
	public static void main(String[] args) {
		
		EntityManager em = null; 
		
		try {	
			
			  em = Persistence.createEntityManagerFactory("desafioconnection-orm").createEntityManager(); 
			  
			  
			  Cliente atualizarCliente = em.find(Cliente.class, 1);
			  
			  atualizarCliente.setNmCliente("Antônio Carlos da Silva");
			  atualizarCliente.setNumeroTelefone("11930512543");
			  
			  em.persist(atualizarCliente); 
			  em.getTransaction().begin(); 
			  em.getTransaction().commit();
			  
			  
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally{
			if (em != null) {
				em.close();
			}
			System.exit(0);
		}
	}
}
	
