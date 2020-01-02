package com.algos.string;

import java.util.TreeSet;

public class UniqueSubstring {

	public static void main(String[] args) 
	{
		String str = "caaabe";
		int k = 4;
		
		TreeSet<String> strSet = new TreeSet();
		
		for(int i=0; i<str.length(); i++)
		{
			StringBuilder strb = new StringBuilder();
			strb.append(""+str.charAt(i));
			int j = 1;
			while(j<k)
			{
				strb.append(""+str.charAt(j));
				j++;
			}
			strSet.add(strb.toString());
			//strb.replace(0, strb.length(), "");
		}
		System.out.println(strSet);
	}

}
