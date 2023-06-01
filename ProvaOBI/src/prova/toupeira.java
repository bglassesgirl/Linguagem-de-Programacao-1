package prova;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class toupeira {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= s; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < t; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            g.get(x).add(y);
            g.get(y).add(x);
        }

        int a = in.nextInt();
        int cont = 0;

        for (int i = 0; i < a; i++) {
            int w = in.nextInt();
            int[] pa = new int[w];
            for (int j = 0; j < w; j++) {
                pa[j] = in.nextInt();
            }

            boolean psv = true;
            for (int j = 1; j < w; j++) {
                int sa = pa[j - 1];
                int ps = pa[j];
                if (!g.get(sa).contains(ps)) {
                    psv = false;
                    break;
                }
            }
            if (psv) {
                cont++;
            }
        }

        System.out.println(cont);
    }
}

