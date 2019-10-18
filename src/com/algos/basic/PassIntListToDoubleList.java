package com.algos.basic;

import java.util.Arrays;
import java.util.List;

public class PassIntListToDoubleList {
	
    public static Double addNumbers(List<Double> list)
    {
    	Double sum = 0.0;
       for(Double i: list) {
    	   sum  = sum +i;
       }
       return sum;
    }
    
    public static void main(String args[])
    {
       List<Integer> ld = Arrays.asList(1,2,3,4,5,6);
       //Double sum = addNumbers(ld);
       //System.out.println(sum);
    }
}

