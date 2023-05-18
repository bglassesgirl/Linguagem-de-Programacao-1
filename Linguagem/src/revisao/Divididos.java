package revisao;

public class Divididos {

	public static void main(String[] args) {
		
		int contador = 0; 
		for(int cont = 1000; cont <=2000; cont++) {
			if(cont % 11 == 5 ) {
				System.out.println(cont + ", ");
				contador++;
			}
		}
		
		System.out.println("Total: " + contador);
		
		/*
		 * % resto da divisao
		 * e == se o resto da divisao for igual a 5
		 * 
		 * o contador incia com 0, e sempre que for dividido 
		 * pelas condições do loop, o contador conta mais uma unidade
		 * com o ´contador++`
		 *  e depois apenas imprime o total de vezes que foi contado 
		 */
	}
	
}
