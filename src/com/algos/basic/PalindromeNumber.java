package com.algos.basic;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;
		String s = num+"";
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1; i>=0; i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		if(sb.toString().equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
