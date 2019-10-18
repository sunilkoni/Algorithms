package com.algos.hacker.medium;

public class JumpSearch {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
                34, 55, 89, 144, 233, 377, 610}; 
    int x = 1; 

    // Find the index of 'x' using Jump Search 
    int index = jumpSearch(arr, x); 

    // Print the index where 'x' is located 
    System.out.println("\nNumber " + x + 
                        " is at index " + index); 

	}

	private static int jumpSearch(int[] arr, int x) {
		int blockSize = (int) Math.floor(Math.sqrt(arr.length));
		int curr=0;
		int prev=0;
		while(curr < arr.length && arr[curr]<=x )
		{
				prev=curr;
				curr=curr+blockSize;
		}
		for(int i=prev; i<curr; i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}

}
