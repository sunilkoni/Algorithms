package com.algos.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) 
	{
		int[] ar1 = {2, 8, 15, 18, 20, 22};
		int[] ar2 = {5, 9, 12, 17};
		
		int[] tmp = new int[ar1.length+ar2.length];
		
		int i = 0, j = 0;
		int k = 0;
		while(i < ar1.length && j < ar2.length)
		{
			if(ar1[i] < ar2[j])
			{
				tmp[k] = ar1[i];
				i++;
			}
			else
			{
				tmp[k] = ar2[j];
				j++;
			}
			k++;
		}
		if(i < ar1.length)
		{
			while(i < ar1.length)
			{
				tmp[k] = ar1[i];
				k++;
				i++;
			}
		}
		if(j < ar2.length)
		{
			while(j < ar2.length)
			{
				tmp[k] = ar1[j];
				k++;
				j++;
			}
		}
		System.out.println("Sorted Merged Array is : ");
		System.out.println(Arrays.toString(tmp));
	}

}
