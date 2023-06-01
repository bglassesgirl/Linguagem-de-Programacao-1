package prova;


import java.util.Scanner;
public class contas {

	
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		
	
		
		int v = in.nextInt();
	 
		
		int a = in.nextInt();
		int f = in.nextInt();
		int p = in.nextInt();
		
		
		
		int contasPagar = 0;
		
		
		
		
		if (v >= a) {
			v -= a;
			contasPagar++;
		}
		if (v >= f) {
			v -= f;
			contasPagar++;
		}
		if (v >= p) {
			v -= p;
			contasPagar++;
		}
		System.out.println(contasPagar);
	}
	
	
}
