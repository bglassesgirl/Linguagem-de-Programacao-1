package principal;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int par = 0;
		int quantPar = 0;
		int impar = 0;
		int quantImpar = 0;
        
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 números: ");
			int numeros = in.nextInt();
			
			if (numeros % 2 == 0) {
				par += numeros;
				quantPar++;    
				
			} else {
				impar += numeros;
				quantImpar++;
   
			}
		}
		
		
	    
		System.out.println("A quantidade de pares é: " + quantPar);
		System.out.println("A soma dos pares é: " + par);
		System.out.println("A quantidade de impares é: " + quantImpar);
		System.out.println("A soma dos impares é: " + impar);
	}

}
