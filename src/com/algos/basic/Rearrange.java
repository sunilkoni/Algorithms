package com.algos.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Rearrange {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 1, 1, 2, 2, 3, 3 }; 
		  
        rearrangeArray(arr); 

	}

	private static void rearrangeArray(int[] arr) {
			ArrayList<Integer> al = new ArrayList<>();
			int cur = 0;
			Queue<Integer> qu = new LinkedList<Integer>();
			
			for(int i=0; i<arr.length; i++)
			{
				if (al.size()==0) {
					al.add(arr[i]);
				}
				else
				{
					if(al.get(cur)==arr[i])
					{
						qu.add(arr[i]);
					}
					else
					{
						al.add(arr[i]);
						cur++;
						for (Integer integer : qu) {
							if(al.get(cur)!=integer)
							{
								al.add(integer);
								cur++;
							}
							else
								break;
						}
					}
				}
			}
			System.out.println(al);
	}

}
