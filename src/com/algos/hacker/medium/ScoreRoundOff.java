package com.algos.hacker.medium;

import java.util.ArrayList;
import java.util.List;

public class ScoreRoundOff {
	
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		//int r = 5.0%2;
		
		for(int i=0; i< grades.size(); i++)
		{
			if(grades.get(i)<38)
				continue;
			int rem = ((grades.get(i)-(grades.get(i)%5))+5)-grades.get(i);
			if(rem<3)
				grades.set(i, grades.get(i)+rem);
		}
		System.out.println(grades);
	}
}
