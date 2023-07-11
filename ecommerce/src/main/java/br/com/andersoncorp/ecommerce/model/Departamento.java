package br.com.andersoncorp.ecommerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // o que significa @Entity? significa que a classe é armazenavel no BD
@Table(name = "departamento") // torna explicito o nome da tabela
public class Departamento {
	@Column(name = "codigo") // explicito o nome da COLUNA no BD
	@Id // significa que é PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
	private Integer codigo; // usando o objeto Integer para caso não ter algum valor, o valor ficar null

	@Column(name = "nome", length = 50, nullable = false) // nome da coluna, tamanho e NOT NULL
	private String nome;

	@Column(name = "descricao", nullable = true, columnDefinition = "TEXT") // tamanho TEXTO do BD
	private String descricao;

	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("departamento")
	private List<Produto> listaProdutos;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
