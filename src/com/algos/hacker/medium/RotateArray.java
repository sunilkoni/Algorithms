package com.algos.hacker.medium;

public class RotateArray {
	static int tmp[] = new int[2];
	static int res[] = new int[7];
	public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        
        leftRotate(arr, 2, 7); 
        printArray(res, 7); 
	}

	private static void printArray(int[] arr, int i) {
		for(int a=0; a<arr.length; a++)
		{
			System.out.print(arr[a]+" ");
		}
	}

	private static void leftRotate(int[] arr, int i, int j) {
		for(int k=0; k<tmp.length; k++)
		{
			tmp[k] = arr[k];
		}
		int count=0;
		for(int l=0; l<arr.length; l++) {
			res[l]=arr[count];
			count++;
		}
		for(int m=0; m<tmp.length; m++) {
			res[count++]=tmp[m];
		}
	}

}
