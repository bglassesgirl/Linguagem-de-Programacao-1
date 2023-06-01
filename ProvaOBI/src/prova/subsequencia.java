
import java.util.Scanner;

public class subsequencia {

	public static void main(String[] args) {
		
		 Scanner in  = new Scanner(System.in);

	      int a = in.nextInt();
	      int b = in.nextInt();
		
		   int[] sa = new int[a];
		   int[] sb = new int[b];
		   
		for (int i = 0; i < a; i++) {
			sa[i]  = in.nextInt();
		}
		
		for (int i = 0; i < b; i++) {
			sb[i]  = in.nextInt();
		}
		
		
		if (verificarSubsequencia(sa, sb)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		in.close();
		
	}

	private static boolean verificarSubsequencia(int[] sa, int[] sb) {
		int i = 0;
		int j = 0;
		
		while (i < sa.length && j < sb.length) {
		  if (sa[i] == sb[j]) {
			j++;
		}
			i++;
		}
		
		
		return j == sb.length;
	}
	
	
}
