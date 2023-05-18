package exercicio2;

import java.util.Scanner;

public class Questao5 {
	 public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);	 
		 
		 System.out.println(" Digite um número: ");
		 int numero = in.nextInt();
		 
		 for(int cont =0; cont <=10; cont++) {
			 int mult = numero*cont;
			 System.out.println(numero+"*"+cont+"="+mult);
		 }
	}
}
