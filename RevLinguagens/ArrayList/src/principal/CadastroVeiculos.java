package principal;

import java.util.ArrayList;

import basicas.Locacao;
import basicas.Veiculo;

public class CadastroVeiculos {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		v1.setId(1);
		v1.setModelo("creta");
		v1.setValor(120000);
		
		Veiculo v2 = new Veiculo();
	    v2.setId(2);
		v2.setModelo("ranger");
		v2.setValor(250000);
		
		Veiculo v3 = new Veiculo();
		v3.setId(3);
		v3.setModelo("corolla cross");
		v3.setValor(172000);
		
		ArrayList<Veiculo> veiculosCadastrados = new ArrayList<>();
	    veiculosCadastrados.add(v1);
	    veiculosCadastrados.add(v2);
	    veiculosCadastrados.add(v3);
		
		Locacao loc = new Locacao();
		loc.setId(1);
		loc.setQtdDiarias(3);
		loc.setStatus("Locado");
		loc.setValorTotal(1200);
		loc.setValorDesconto(200);
		loc.setVeiculosLocados(veiculosCadastrados);
		
				
		System.out.println("-----------------------------");	
			
		System.out.println("ID: " + loc.getId() );
		System.out.println("Status: " + loc.getStatus() );
		System.out.println("Valor total: " + loc.getValorTotal() );
		System.out.println("Quantidade de diárias: " + loc.getQtdDiarias() );
		System.out.println("Valor Desconto: " + loc.getValorDesconto() );
				
	    System.out.println("-----------------------------");	
	    System.out.println("        CUPOM FISCAL         ");
		System.out.println("-----------------------------");
		
		System.out.println("- lista de veiculos locados  -");
		System.out.println("" + loc.getVeiculosLocados());
				
	}
	
	
}
