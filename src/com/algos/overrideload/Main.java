package com.algos.overrideload;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * Parent p = new Child(); Child c = (Child) p; GrandChild g = (GrandChild) c;
		 * System.out.println(g.j);
		 */
		GrandChild g = new GrandChild();
		Parent p = g;
		g.grand();
		//System.out.println(p.k);
		System.out.println(g.k);
		
		System.out.println(callMe());
		//float m = 1.5;
		System.out.println(0.1*3);
		int[] ar = {1,3,4,5,5,5};
		System.out.println(Arrays.toString(ar));
	}

	private static int callMe() {
		try {
			int c = 1/1;
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return 2;
		}
	}
	
	private static void showCasting()
	{
		Parent c = new Child();
		Child c1 = (Child) c; //needs to typecasted as c is of type parent 
		GrandChild gc = (GrandChild) c1;//needs to typecasted as c is of type parent
		System.out.println(3*0.1);
	}
}
