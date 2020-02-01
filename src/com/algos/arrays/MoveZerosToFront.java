package com.algos.arrays;

public class MoveZerosToFront {
	static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = n-1;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = n-1; i >=0; i--) 
            if (arr[i] != 0) 
                arr[count--] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count >= 0) 
            arr[count--] = 0; 
    } 
  
    /*Driver function to check for above functions*/
    public static void main (String[] args) 
    { 
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i]+" "); 
        int n = arr.length; 
        pushZerosToEnd(arr, n); 
        System.out.println("\nArray after pushing zeros to the back: "); 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
}
