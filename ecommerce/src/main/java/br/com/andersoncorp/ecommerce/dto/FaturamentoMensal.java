package br.com.andersoncorp.ecommerce.dto;

// DTO = Data Transformation Object
public class FaturamentoMensal {
	private Integer mes;
	private double valorTotal;

	public FaturamentoMensal(Integer mes, double valorTotal) {
		super();
		this.mes = mes;
		this.valorTotal = valorTotal;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
