package com.algos.basic;

public class BooleanTwoDimenArray {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print("-");
			}
		}
	}

}
