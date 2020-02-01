package com.algos.arrays;

public class LargestContiguousSum {

	public static void main(String[] args) 
	{
		int[] ar = {-3, -4, 4, -1, -2, 1, 5, -3};
		
		int max = getMaxContiguousSum(ar);
		System.out.println("The Maximum Sum formed Contiguously is : "+max);
	}

	private static int getMaxContiguousSum(int[] ar) {
		if(ar.length == 1)
			return ar[0];
		int cur_max = ar[0];
		int max_so_far = ar[0];
		
		for(Integer i : ar)
		{
			cur_max = Math.max(cur_max+i, i);
			max_so_far = Math.max(max_so_far, cur_max);
		}
		return max_so_far;
	}

}
