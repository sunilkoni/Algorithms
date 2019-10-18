package com.algos.overrideload;

public class Main {
	public static void main(String[] args) {
		/*
		 * Parent p = new Child(); Child c = (Child) p; GrandChild g = (GrandChild) c;
		 * System.out.println(g.j);
		 */
		GrandChild g = new GrandChild();
		Parent p = (Parent) g;
		//System.out.println(p.k);
		System.out.println(g.k);
		
		System.out.println(callMe());
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
}
