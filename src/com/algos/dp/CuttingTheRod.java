package com.algos.dp;

public class CuttingTheRod {

	public static void main(String[] args) {
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("Maximum Obtainable Value is "+ 
                            cutRod(arr, size)); 
        System.out.println(Math.max(20, 20));
	}

	private static int cutRod(int[] arr, int size) 
	{
		int[][] memo = new int[size][size];
		for(int i=1; i<size; i++)
		{
			for(int j=1; j<memo[i].length; j++)
			{
				if(j>=i)
					memo[i][j] = Math.max(memo[i-1][j], arr[i]+memo[i][j-i]);
				else
					memo[i][j] = memo[i-1][j];
			}
		}
		return memo[size-1][size-1];
		
	}

}
