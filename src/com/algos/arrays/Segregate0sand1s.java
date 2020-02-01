package com.algos.arrays;

public class Segregate0sand1s {

	public static void main(String[] args) 
	{
		int[] ar = {0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0};
		
		int i=0;
		int j=0;
		int n=ar.length;
		while(j < n)
		{
			if(ar[i] == 0 && ar[j] == 0)
			{
				i++;
				j++;
			}
			
		}
	}

}
