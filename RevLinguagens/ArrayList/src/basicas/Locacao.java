package basicas;

import java.util.ArrayList;

public class Locacao {

	private int id;
	private String status;
	private double valorTotal;
	private int qtdDiarias;
	private double valorDesconto;
	ArrayList<Veiculo> veiculosLocados = new ArrayList<>();
	
	public Locacao() {
		super();
	}

	public Locacao(int id, String status, double valorTotal, int qtdDiarias, double valorDesconto,
			ArrayList<Veiculo> veiculosLocados) {
		super();
		this.id = id;
		this.status = status;
		this.valorTotal = valorTotal;
		this.qtdDiarias = qtdDiarias;
		this.valorDesconto = valorDesconto;
		this.veiculosLocados = veiculosLocados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQtdDiarias() {
		return qtdDiarias;
	}

	public void setQtdDiarias(int qtdDiarias) {
		this.qtdDiarias = qtdDiarias;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public ArrayList<Veiculo> getVeiculosLocados() {
		return veiculosLocados;
	}

	public void setVeiculosLocados(ArrayList<Veiculo> veiculosLocados) {
		this.veiculosLocados = veiculosLocados;
	}

	@Override
	public String toString() {
		return "Locacao [id=" + id + ", status=" + status + ", valorTotal=" + valorTotal + ", qtdDiarias=" + qtdDiarias
				+ ", valorDesconto=" + valorDesconto + ", veiculosLocados=" + veiculosLocados + "]";
	}
	
	
}
