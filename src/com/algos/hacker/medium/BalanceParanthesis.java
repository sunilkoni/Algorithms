package com.algos.hacker.medium;

import java.util.ArrayList;
import java.util.List;

public class BalanceParanthesis {

	static String OPEN="({[";
	static String CLOSE=")}]";
	public static void main(String[] args) {
		char exp[] = {'{','(',')','}','[',']','[','}'}; 
        if (areParenthesisBalanced(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced "); 

	}

	private static boolean areParenthesisBalanced(char[] exp) {
		List<Character> llOpen = new ArrayList<>();
		List<Character> llClose = new ArrayList<>();
		for(char c : exp)
		{
			if(OPEN.contains(c+""))
				llOpen.add(c);
			else
				llClose.add(c);
			
		}
		if(llClose.size()==llOpen.size())
		return true;
		return false;
	}

}
