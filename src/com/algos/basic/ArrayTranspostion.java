package com.algos.basic;

public class ArrayTranspostion {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int num=1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=num++;
			}
		}
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("********* Transpose**********");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
