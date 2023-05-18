package revisao;

import java.util.Scanner;

public class Eleicao {

	
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Informe o ano atual: ");
		int anoAtual = in.nextInt();
		
		System.out.println("Informe seu ano de nascimento: ");
		int anoNascimento = in.nextInt();
	
		int idade = anoAtual - anoNascimento;
	
	
		if (idade >= 18 && idade <= 70) {
			System.out.println("O voto é obrigatório! ");
		} else if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("O voto é opcional! ");
		}else {
			System.out.println("O voto é proibido! ");
		}
	
	
	}
}
