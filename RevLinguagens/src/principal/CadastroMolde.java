package principal;

import basicas.Cliente;
import basicas.Pizza;
import basicas.Sabor;
import basicas.Venda;

public class CadastroMolde {

	public static void main(String[] args) {

		Venda venda = new Venda();
		venda.id = 1;
		venda.data = "17/05";
		venda.pizza = new Pizza();
		venda.pizza.id = 01;
		venda.pizza.valor = 59.90;
		venda.pizza.tamanho = "GG";
		venda.pizza.sabor = new Sabor();
		venda.pizza.sabor.id = 001;
		venda.pizza.sabor.nome = "Frango com Catupiryu";
		venda.pizza.sabor.ingredientes = "Frango, queijo, catupiry e cebola";
		venda.cliente = new Cliente();
		venda.cliente.id = 0001;
		venda.cliente.nome = "Carlos";
	
		
		Venda venda1 = new Venda();
		venda1.id = 2;
		venda1.data = "17/05";
		venda1.pizza = new Pizza();
		venda1.pizza.id = 02;
		venda1.pizza.valor = 39.90;
		venda1.pizza.tamanho = "G";
		venda1.pizza.sabor = new Sabor();
		venda1.pizza.sabor.id = 002;
		venda1.pizza.sabor.nome = "Calabresa";
		venda1.pizza.sabor.ingredientes = "Calabresa, queijo, catupiry e cebola";
		venda1.cliente = new Cliente();
		venda1.cliente.id = 0002;
		venda1.cliente.nome = "Nathalia";
		
	    
		System.out.println("----- VENDAS ---");
		System.out.println("----- venda 1 ---");
		System.out.println("Id: " + venda.id + ", " +"Data: " + venda.data + ", " +"Tamanho Pizza: " + venda.pizza.tamanho + ", "
				+" Sabor: " + venda.pizza.sabor.nome+ ", " +" Ingredientes: " + venda.pizza.sabor.ingredientes + ", "
				+" Cliente: " + venda.cliente.nome);
		
		
		System.out.println("----- venda 2 ---");
		System.out.println("Id: " + venda1.id + ", " +"Data: " + venda1.data + ", " +"Tamanho Pizza: " + venda1.pizza.tamanho + ", "
				+" Sabor: " + venda1.pizza.sabor.nome+ ", " +" Ingredientes: " + venda1.pizza.sabor.ingredientes + ", "
				+" Cliente: " + venda1.cliente.nome);
		
		Venda v = new Venda();
		v.id = 3;
		v.data = "17/05";
		v.pizza = new Pizza();
		v.pizza.id = 03;
		v.pizza.valor = 39.90;
		v.pizza.tamanho = "G";
		v.pizza.sabor = new Sabor();
		v.pizza.sabor.id = 003;
		v.pizza.sabor.nome = "Quatro queijo";
		v.pizza.sabor.ingredientes = "queijo, catupiry, cheddar, queijo coalho";
		v.cliente = new Cliente();
		v.cliente.id = 0003;
		v.cliente.nome = "Luana";
		
		System.out.println("----- venda 3 ---");
		System.out.println(v.imprmirDdos());
	}
}
