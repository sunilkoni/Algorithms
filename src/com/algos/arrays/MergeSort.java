package com.algos.arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) 
	{
		int[] ar = {5, 3, 6, 1, 7, 2, 0, 4, 8, 10};
		int end = ar.length-1;
		int start = 0;
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(ar));
		mergeSort(ar, start, end);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(ar));
	}

	private static void mergeSort(int[] ar, int start, int end) 
	{
		if(start >= end)
			return;
		int mid = (start+end)/2;
		
		mergeSort(ar, start, mid);
		mergeSort(ar, mid+1, end);
		merge(ar, start, end);
	}

	private static void merge(int[] ar, int start, int end) 
	{
		int[] tmp = new int[ar.length];
		int mid = (start+end)/2;
		int i=start;
		int j=mid+1;
		int k=start;
		while(i<=mid && j <= end)
		{
			if(ar[i] < ar[j])
			{
				tmp[k] = ar[i];
				i++;
				k++;
			}
			else
			{
				tmp[k] = ar[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
			tmp[k++] = ar[i++];
		while(j<=end)
			tmp[k++] = ar[j++];
		
		for(int a=start; a<=end; a++)
			ar[a] = tmp[a];
	}

}
