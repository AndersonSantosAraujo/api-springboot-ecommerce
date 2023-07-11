package br.com.andersoncorp.ecommerce.service;

import java.util.ArrayList;

import br.com.andersoncorp.ecommerce.dto.FaturamentoMensal;
import br.com.andersoncorp.ecommerce.model.Pedido;

public interface IPedidoService {
	public Pedido inserirNovoPedido(Pedido novo);

	public Pedido recuperarPeloNumero(Integer numero);

	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano);
}
