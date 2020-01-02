package com.algos.basic;

public class QuickSort {

	public static void main(String[] args) {
		int[] ar = {5, 2, 6, 3, 8, 1, 10, 20, 4, 7};
		
		quickSort(ar, 0, ar.length);
		System.out.println(ar);
	}

	private static void quickSort(int[] ar, int l, int h) {
		if(l<h)
		{
			int j = partition(ar, l, h);
			quickSort(ar, l, j-1);
			quickSort(ar, j+1, h);
		}
	}

	private static int partition(int[] ar, int l, int h) {
		int pivot = ar[h];
		int i=l-1; 
		int j=h;
		while (i<j) {
			do {
				i++;
			} while (ar[i] <= pivot);
			do {
				j--;
			} while (ar[j] > pivot);
			if (i < h) {
				int tmp = ar[i];
				ar[i] = ar[j];
				ar[j] = tmp;
			} 
		}
		int tmp = ar[l];
		ar[l] = ar[j];
		ar[j] = tmp;
		return j;
	}

}
