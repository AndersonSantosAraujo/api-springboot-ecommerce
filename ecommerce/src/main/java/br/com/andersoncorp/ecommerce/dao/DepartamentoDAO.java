package br.com.andersoncorp.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.andersoncorp.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
