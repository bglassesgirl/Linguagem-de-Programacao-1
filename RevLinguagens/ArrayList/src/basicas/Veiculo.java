package basicas;

public class Veiculo {

	private int id;
	private String modelo;
	private double valor;
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(int id, String modelo, double valor) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", modelo=" + modelo + ", valor=" + valor + "]";
	} 
	
	
	
}
