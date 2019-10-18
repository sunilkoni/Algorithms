package com.algos.hacker.medium;

import java.util.HashSet;
import java.util.Set;

public class PangramString {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog"; 
		  
        if (checkPangram(str) == true) 
            System.out.print(str + " is a pangram."); 
        else
            System.out.print(str+ " is not a pangram.");
	}

	private static boolean checkPangram(String str) {
		Set<String> set = new HashSet<>();
		str = str.replace(" ", "");
		for(int i=0; i<str.length(); i++)
		{
			String s = String.valueOf(str.charAt(i)).toLowerCase();
				set.add(s);
		}
		System.out.println(set);
		if(set.size()==26)
			return true;
		return false;
	}

}
