package com.algos.string;

public class CheckIfStringIsRotated {

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "eksge";
		
		String s3 = s1+s1;
		if(s3.contains(s2))
			System.out.println("Yes it is rotated");
		else
			System.out.println("No it is not");
	}

}
