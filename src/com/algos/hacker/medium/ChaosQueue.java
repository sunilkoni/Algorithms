package com.algos.hacker.medium;

public class ChaosQueue {

	public static void main(String[] args) {
		int[] in = {1,2,3,5,6,4};
		System.out.println(minimumBribes(in));
	}
	
	// Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {
        int n = q.length;
        int j = 1, i=0;
        int count=0;
        while(i<n && j<n+2)
        {
        	if(q[i]==j)
        	{
        		j++;
        		i++;
        		continue;
        	}
        	if(q[i] != j)
        	{
        		if(q[i]==++j)
        		{
        			j+=2;
        			i+=2;
        			count++;
        			continue;
        		}
        	}
        }
        return count+"";
    }

}
