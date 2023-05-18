package principal;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		 	
		Scanner in = new Scanner(System.in);

		int maiorValor = 0;
		
		/*Integer.MIN_VALUE
		 *  --> inicializa com o menor valor
		 *  mas o zero tbm serve 
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 números: ");
			int numeros = in.nextInt();
			
			if (numeros > maiorValor) {
				maiorValor = numeros;
			}	
		}
		 
		System.out.println("Maior valor digitado: " + maiorValor);
		
	}
	
}
