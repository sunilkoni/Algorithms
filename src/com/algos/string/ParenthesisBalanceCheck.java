package com.algos.string;

import java.util.Stack;

public class ParenthesisBalanceCheck {
	
	public static void main(String[] args) 
	{
		System.out.println(isBalanced("([[)"));
	}
	
	// Complete the isBalanced function below.
    static String isBalanced(String s) 
    {
        Stack<Character> st = new Stack<Character>();
        String res = "YES";
        for(Character c : s.toCharArray())
        {
            if(c=='{' || c=='(' || c=='[')
                st.push(c);
            else{
               char cur =  st.pop();
               if(!checkIfNotOpp(c, cur))
                {
                    res = "NO";
                    break;
                }
            }
                
        }
        
        return res;

    }

	private static boolean checkIfNotOpp(Character c, char cur) 
	{
		if(c==')' && cur != '(')
			return false;
		else if(c=='}' && cur != '{')
			return false;
		else if(c==']' && cur != '[')
			return false;
		else
			return true;
	}
}
