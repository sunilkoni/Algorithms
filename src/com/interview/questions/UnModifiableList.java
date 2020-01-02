package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnModifiableList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> ul = Collections.unmodifiableList(al);
		ul = callMe(ul);
		System.out.println(ul);
	}

	private static List<Integer> callMe(List<Integer> al) {
		List<Integer> ll = al;
		ll.add(3);
		al.add(2);
		return ll;
	}

}
