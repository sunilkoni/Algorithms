package com.algos.hacker.medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr)
    {
        
        List<Integer> res = new ArrayList<>();
        while(isNonZeroExists(arr))
        {
            int smallest = getSmallest(arr);
            int count = 0;
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]>0)
                {
                    arr[i]=arr[i]-smallest;
                    count++;
                }
            }

            if(count>0)
                res.add(count);

        }
        return res.stream().mapToInt(i-> i).toArray();
    }


    private static int getSmallest(int[] arr)
    {
    	List<Integer> arrL = new ArrayList<>();
        for(Integer i : arr)
        {
            arrL.add(i);
        }
        return arrL.stream().filter(i -> i>0).mapToInt(i-> i).min().getAsInt();
    }

    private static boolean isNonZeroExists(int[] arr)
    {
        for(Integer i: arr)
        {
        	if(i>0)
        		return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = cutTheSticks(arr);
        System.out.println(Arrays.toString(result));
    }
}


