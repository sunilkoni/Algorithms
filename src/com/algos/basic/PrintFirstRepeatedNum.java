package com.algos.basic;

import java.util.HashSet;
import java.util.Set;

public class PrintFirstRepeatedNum {

	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 6, 5, 6}; 
		printFirstRepeating(arr);

	}

	private static void printFirstRepeating(int[] arr) {
		Set<Integer> s = new HashSet<>();
		for(int a : arr)
		{
			if(!s.add(a)) {
				System.out.println(a);
				break;
			}
			
		}
	}

}
