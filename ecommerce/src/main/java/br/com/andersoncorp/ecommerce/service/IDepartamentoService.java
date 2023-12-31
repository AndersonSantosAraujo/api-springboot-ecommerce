package br.com.andersoncorp.ecommerce.service;

import java.util.ArrayList;

import br.com.andersoncorp.ecommerce.model.Departamento;

public interface IDepartamentoService {
	public Departamento criarNovo(Departamento novo);

	public Departamento atualizarDados(Departamento dados);

	public ArrayList<Departamento> buscarTodos();

	public Departamento buscarPeloId(Integer id);

	public void excluirDepartamento(Integer id);
}
