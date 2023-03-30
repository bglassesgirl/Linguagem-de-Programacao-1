package exercicio2;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Escreva seu nome: ");
		String nome = in.nextLine();
		
		System.out.println("Informe seu peso(kgs) e sua altura(metros): ");
		double peso = in.nextDouble();
		double altura = in.nextDouble();
		
		System.out.println(nome+",  seu IMC de acordo com os dados apresentados é: "+(peso/(altura*altura)));
		
		
	}
	
}
