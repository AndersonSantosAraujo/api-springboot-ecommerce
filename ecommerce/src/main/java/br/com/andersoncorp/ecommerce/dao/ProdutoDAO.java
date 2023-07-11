package br.com.andersoncorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.andersoncorp.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {
	// aqui coloca uma query customizada
	// (https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details)
	public ArrayList<Produto> findByOrderByPreco();

	public ArrayList<Produto> findByOrderByPrecoDesc();

	public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
