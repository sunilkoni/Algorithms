package com.algos.basic;

public class ArrayHistogram {

	public static void main(String[] args) {
		int a[] = {3,4,2,5,2,3,4,6,4,6};
		int retArr[] = histogram(a,6);
		for(int i=0; i<retArr.length; i++)
			System.out.print(retArr[i]+"-");
	}
	
	public static int[] histogram(int a[], int m)
	{
		int retArr[] = new int[m];
		for(int i=0; i<retArr.length; i++) 
		{
			int count = 0;
			for(int j=0; j<a.length; j++)
			{
					if(i==a[j])
						count++;
			}
			retArr[i]=count;
		}
		return retArr;
	}
}
