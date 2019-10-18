package com.algos.hacker.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String s1 = s.replace(" ","");
        double root = Math.sqrt(s1.length());
        int row = (int)Math.floor(root);
        int col = (int)Math.ceil(root);
        int counter = 0;
        if(row*col < s1.length())
            row = col;
        String[][] charArr = new String[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(counter<s1.length()) {
                    charArr[i][j]=s1.charAt(counter)+"";
                    counter++;
                }
            }
        }
		/*
		 * for(int k=0; k<row; k++) { for(int l=0; l<col; l++) {
		 * System.out.print(charArr[k][l]); } System.out.println(); }
		 */
        StringBuffer result=new StringBuffer();
        int collumn=0;
        while (collumn!=col) {
			for (int k = 0; k < row; k++) {
				if (charArr[k][collumn] != null) {
					result.append(charArr[k][collumn]);
				}
			}
			result.append(" ");
			//System.out.println(result.toString());
			collumn++;
		}
		return result.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "feedthedog";

        String result = encryption(s);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

