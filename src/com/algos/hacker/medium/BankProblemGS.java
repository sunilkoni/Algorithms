package com.algos.hacker.medium;

import java.util.Scanner;

public class BankProblemGS {
	static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        double fee = 0;
        float mult = x/100.0f;
        for(int i=0; i< n; i++)
        {
            fee = (long) (fee + Math.max(k, (p[i]*mult)));
        }
        System.out.println(fee);
        if(d < fee)
            return "upfront";
        return "fee";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            System.out.println();
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}
