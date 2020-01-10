package com.algos.arrays;

public class MinimumCostPath {

	/*
	 * out put should be 14 3+5+2+3+1 You can only go 
	 */
	public static void main(String[] args) {
		int[][] ar = {
						{3, 5, 2},
						{5, 2, 7},
						{7, 3, 1}
					 };
		int[][] tmp = ar;
		for(int i=0; i<3; i++)
		{
			for(int j=1; j<3; j++)
			{
				if(i==0)
				{
					tmp[i][j] = tmp[i][j]+tmp[i][j-1];
				}
			}
		}
		for(int i=1; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j==0)
				{
					tmp[i][j] = tmp[i][j]+tmp[i-1][j];
				}
			}
		}
		for(int i=1; i<3; i++)
		{
			for(int j=1; j<3; j++)
			{
				tmp[i][j] = Math.min(tmp[i-1][j]+tmp[i][j], tmp[i][j-1]+tmp[i][j]);
			}
		}
		print2dArray(tmp);
		System.out.println("Minimum cost to reach end of matrix is : "+tmp[2][2]);
	}
	
	public static void print2dArray(int[][] in)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(in[i][j]+" ");
			}
			System.out.println();
		}
	}
}
