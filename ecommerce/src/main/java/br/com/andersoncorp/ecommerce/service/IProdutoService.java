package br.com.andersoncorp.ecommerce.service;

import java.util.ArrayList;

import br.com.andersoncorp.ecommerce.model.Produto;

public interface IProdutoService {
	public ArrayList<Produto> recuperarTodos();

	public Produto recuperarPeloCodigo(Integer codigo);

	public Produto cadastrarNovo(Produto novo);

	public ArrayList<Produto> buscarPorPalavraChave(String palavra);

}
