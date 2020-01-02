package com.interview.questions;

public class MaximumPrevNNextProd {
	public static void main(String[] args) 
    { 
        int[] a = { 5, 6, 4, 3, 2 }; 
        int n = a.length; 
        System.out.println(maxElement(a, n)); 
    }

	private static int maxElement(int[] a, int n) {
		int maxProd = 0;
		int curProd = 0;
		for(int i=0; i<n; i++)
		{
			if(i==0) {
				curProd = a[i+1]*a[n-1];
				if(curProd > maxProd)
					maxProd=curProd;
			}
			else if(i==n-1) {
				curProd = a[i-1]*a[0];
				if(curProd > maxProd)
					maxProd=curProd;
			}
			else {
				curProd=a[i-1]*a[i+1] ;
				if(curProd > maxProd)
					maxProd=curProd;
			}
			
		}
		return maxProd;
	} 
}
