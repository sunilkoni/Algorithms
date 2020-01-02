package com.algos.arrays;

public class MaxSumSubSeq {

	public static void main(String[] args) {
		int[] ar = {2, 3, 5, 1, 6, 3, 7, 2, 4, 9, 2, 1, 2};
		
		int k =3;
		int highest = getHighestSumOfKSeq(ar, k);
		System.out.println(highest);
	}

	private static int getHighestSumOfKSeq(int[] ar, int k) 
	{
		int n = ar.length;
		int max = 0;
		for(int i=0; i<n-k-1; i++)
		{
			int sum=0;
			int j=i;
			for(int m=0; m<k; m++)
			{
				sum+=ar[j];
				j++;
			}
			if(sum>max)
				max=sum;
		}
		return max;
	}

}
