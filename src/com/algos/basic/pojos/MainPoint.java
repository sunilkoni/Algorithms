package com.algos.basic.pojos;

import java.util.ArrayList;
import java.util.List;

public class MainPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		System.out.println(p1.hashCode() +" "+ p2.hashCode());
		p2 = new Point(1, 2);
		System.out.println(p1.hashCode() +" "+ p2.hashCode());
		System.out.println(p1.equals(p2));
		
		final List<String> l1 = new ArrayList<String>();
		l1.add("SS");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		//l1 = null;
		//l1.add(1);
	}

}
