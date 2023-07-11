package br.com.andersoncorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.andersoncorp.ecommerce.dto.FaturamentoMensal;
import br.com.andersoncorp.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

	// select sum(valor_final) as valorTotal, month(data_pedido) as mes from pedido
	// where year(data_pedido) = 2021 group by month(data_pedido) order by
	// month(data_pedido);

	// JPQL = JPA Query Language = Java Persistence Query Language
	@Query("SELECT new br.com.andersoncorp.ecommerce.dto.FaturamentoMensal(month(p.dataPedido), sum(p.valorFinal)) FROM Pedido p WHERE year(p.dataPedido) = :ano GROUP BY month(p.dataPedido) ORDER BY month(p.dataPedido)")
	public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(@Param("ano") Integer ano);
}
