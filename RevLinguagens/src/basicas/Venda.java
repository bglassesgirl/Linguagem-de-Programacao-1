package basicas;

public class Venda {
   
	public int id;
	public String data;
	public Pizza pizza;
	public Cliente cliente;
	
	
	public String imprmirDdos() {
		return "Venda [id=" + id + ", data=" + data + ", tamanho da pizza=" + pizza.tamanho
				+ "Valor; " + pizza.valor + ", cliente=" + cliente.nome + "]";
	} 
	
    
}
