package com.algos.hacker.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargetSubSetNonDevisibleByK {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(278);
		nums.add(576);
		nums.add(496);
		nums.add(727);
		nums.add(410);
		nums.add(124);
		nums.add(338);
		nums.add(149);
		nums.add(209);
		nums.add(702);
		nums.add(282);
		nums.add(718);
		nums.add(771);
		nums.add(575);
		nums.add(436);
		
		
		Set<Integer> res = new HashSet<>();
		
		for(int i=0; i<nums.size(); i++)
		{
			for(int j=i+1; j<nums.size(); j++)
			{
				int a = nums.get(i);
				int b = nums.get(j);
				if((a+b) % 7 != 0)
				{
					
					res.add(a);
					res.add(b);
				}
					
			}
		}
		System.out.println(res.size());
	}

}
