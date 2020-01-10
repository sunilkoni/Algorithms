package com.algos.arrays;

public class MaxSumAndDiffPair {

	public static void main(String[] args) {
		int[] ar = {4, 5, 7, 12, 45, 22, 65, 23, 1, 7, 9};
		int highest = 0;
		int highest_2 = 0;
		
		int lowest = Integer.MAX_VALUE;
		
		for(int i=0; i< ar.length; i++)
		{
			int cur = ar[i];
			if(cur>highest)
			{
				highest_2=highest;
				highest=cur;
			}
			if(cur < lowest)
				lowest = cur;
			
		}
		System.out.println("Highest : "+highest+" 2nd Highest : "+highest_2+" Maximum Sum of Pair : "+ (highest+highest_2));
		System.out.println("Highest : "+highest+" Lowest : "+lowest+" Maximum Diff between 2 numbers are : "+(highest-lowest));
	}

}
