package exercicio2;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = in.nextLine();
		
		for(int cont = 0; cont < 100000; cont++) {
		System.out.println(frase);
		
		}
		
	}
}
