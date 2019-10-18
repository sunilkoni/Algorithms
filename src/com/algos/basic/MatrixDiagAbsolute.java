package com.algos.basic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
             int leftDiag = 0;
             int rightDiag = 0;
             int a = 0;
             int b = arr.size()-1;
             for(int i=0; i<arr.size(); i++)
             {
                for(int j=0; j<arr.get(i).size(); j++)
                {
                    if (i==j) {
						leftDiag = leftDiag + arr.get(i).get(j);
						rightDiag = rightDiag + arr.get(a).get(b);
					}
                }
              --b;
              ++a;
             }
             System.out.println(leftDiag);
             System.out.println(rightDiag);
             int res = leftDiag-rightDiag;
             return Math.abs(res);

    }

}

public class MatrixDiagAbsolute {
    public static void main(String[] args) throws IOException {


        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> f = new ArrayList<>();
        f.add(11);
        f.add(2);
        f.add(4);
        List<Integer> f2 = new ArrayList<>();
        f2.add(4);
        f2.add(5);
        f2.add(6);
        List<Integer> f3 = new ArrayList<>();
        f3.add(10);
        f3.add(8);
        f3.add(-12);
        
        arr.add(f);
        arr.add(f2);
        arr.add(f3);

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
    }
}
