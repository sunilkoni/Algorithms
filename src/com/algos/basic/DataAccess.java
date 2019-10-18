package com.algos.basic;

public class DataAccess {

	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(20);
		callMe(a,b);
		System.out.println("a = "+a+" b = "+b);
	}

	private static void callMe(int a, Integer b) {
		a=11;
		b=21;
	}

}
