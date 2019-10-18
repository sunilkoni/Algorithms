package com.algos.hacker.medium;

import java.util.HashSet;

public class CountDistinct {

	public static void main(String[] args) {
		int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 }; 
	    int n = arr.length; 
	    System.out.println(countDistinct(arr, n)); 
	}

	private static int countDistinct(int[] arr, int n) {
		int num=0;
		HashSet<Integer> s = new HashSet<>();
		for(Integer i : arr)
		{
			if(s.add(i))
				num++;
		}
		return num;
	}

}
