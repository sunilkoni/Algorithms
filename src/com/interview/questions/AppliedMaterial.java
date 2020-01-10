package com.interview.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppliedMaterial {

	public static void main(String[] args) {
		// removing after itr is created.
		List<String> names = new ArrayList<String>();
		names.add("Sunil");
		Iterator<String> itr = names.iterator();
		names.remove(0);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		List<Integer> years = new ArrayList<>();
		years.add(2007); years.add(2008); years.add(2009);
		
		for(int i : years)
		{
			int index = years.indexOf(i);
			years.set(index, i++);
		}
		System.out.println(years);
	}

}
