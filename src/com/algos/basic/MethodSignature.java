package com.algos.basic;

public class MethodSignature {

	public static void main(String[] args) {
		MethodSignature m = new MethodSignature();
		//m.sum(5, 6);
		m.sum(2, new Integer(10));
	}
	
	/*
	 * public int sum(int a, int b) { System.out.println("1"); return a+b; }
	 */
	
	public int sum(Integer a, Integer b)
	{
		System.out.println("2");
		return a+b;
	}

}
