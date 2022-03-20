package br.com.fiap.desafioconnection.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.desafioconnection.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Integer> {

	public ProdutoDAO(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	public List<Produto> bebidaFavorita() {
		return em.createQuery("Select sum(qtProduto), nmProduto from Produto group by nmProduto order by nmProduto").setMaxResults(1)
				.getResultList();
	}

}