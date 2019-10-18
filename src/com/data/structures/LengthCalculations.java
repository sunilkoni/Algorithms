package com.data.structures;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class LengthCalculations {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println("Start");
		for(int i=0; i<10000000; i++)
		{
			al.add(i);
			ll.add(i);
		}
		System.out.println("End");
		Date als = new Date();
		al.size();
		Date ale = new Date();
		System.out.println(al.size());
		System.out.println(ale.getTime() - als.getTime());
		
		Date lls = new Date();
		ll.size();
		Date lle = new Date();
		System.out.println(ll.size());
		System.out.println(lle.getTime() - lls.getTime());
		
	}

}
