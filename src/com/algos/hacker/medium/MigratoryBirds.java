package com.algos.hacker.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

	public static void main(String[] args) {
		System.out.println(migratoryBirds(Arrays.asList(1,2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
	}
	
	static int migratoryBirds(List<Integer> arr) 
    {
        if(arr == null || arr.size() == 0)
            return 0;
        HashMap<Integer, Long> count = (HashMap<Integer, Long>) arr
        								.stream()
        								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Entry<Integer, Long> desired = null;
        Set<Entry<Integer, Long>> entries = count.entrySet();
        for(Entry<Integer, Long> entry : entries)
        {
        	if(desired == null)
        		desired = entry;
        	else
        	{
        		if(entry.getValue() > desired.getValue())
        			desired = entry;
        		else if(entry.getValue() == desired.getValue() && entry.getKey() < desired.getKey())
        			desired = entry;
        			
        	}
        }
        System.out.println(count);
        
        return desired.getKey();
        
    }
}
