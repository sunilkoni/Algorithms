package com.algos.basic;

public class TryCatchFinallyReturn {

	public static void main(String[] args) {
		String result = getResult();

	}

	private static String getResult() {
		try {  
		    int c = 0/10;
		    return "success";  
		}  
		catch (Exception e) {   
		    return "failure";  
		}  
		finally {  
		    return "I don't know if this will get printed out";
		}
	}

}
