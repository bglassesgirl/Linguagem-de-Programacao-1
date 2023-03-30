package exercicio2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite uma frase e quantas vezes deseja repeti-la");
	String frase = in.nextLine();
	int cont = in.nextInt();
	
	for(int i = 0; i < cont; i++) {
	System.out.println(frase);
	
	}
	
	}
	
}
