package com.algos.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AliceBobTriplet {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

            List<Integer> res = new ArrayList<Integer>();
        int alice=0;
        int bob=0;
        for(int i=0; i<a.size(); i++)
        {
            if(((int)a.get(i)) > ((int)b.get(i)))
            {
                ++alice;
            }
            else if(((int)a.get(i)) < ((int)b.get(i)))
            {
                ++bob;
            }
        }
        res.add(alice);
        res.add(bob);
        return res;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(6);
        a.add(7);

        List<Integer> b = new ArrayList<Integer>();
        b.add(3);
        b.add(6);
        b.add(10);
        
        List<Integer> result = compareTriplets(a, b);

        System.out.println(result);

    }

}
