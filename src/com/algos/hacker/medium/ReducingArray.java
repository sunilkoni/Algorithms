package com.algos.hacker.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReducingArray {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	// Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) 
    {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(Integer i : arr)
        {
        	if(countMap.get(i) != null)
        	{
        		int c = countMap.get(i);
        		countMap.put(i, c+1);
        	}
        	else
        		countMap.put(i, 1);
        }
        Map.Entry<Integer, Integer> highest = null;
        int totalCount=0;
        for(Map.Entry<Integer, Integer> e : countMap.entrySet())
        {
        	if(highest==null)
        		highest=e;
        	else {
        		if(e.getValue() >= highest.getValue())
        			highest=e;
        	}
        	totalCount+=e.getValue();
        }
        return totalCount-highest.getValue();
    }

}
