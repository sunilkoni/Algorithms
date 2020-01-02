package com.algos.arrays;

public class ArrayManupalation {

	public static void main(String[] args) 
	{
		int[][] queries = {
							{2, 6, 8},
							{3, 5, 7},
							{1, 8, 1},
							{5, 9, 15}
						  };
		int[][] queries1 = {
				{1, 5, 3},
				{4, 8, 7},
				{6, 9, 1}
			  };
		long max = arrayManipulation(10, queries);
		System.out.println(max);
	}

	static long arrayManipulation(int n, int[][] queries) {
        int res[] = new int[n];
        int m = queries.length;
        for(int i=0; i<m; i++)
        {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            for(int j=a-1; j< b; j++)
            {
                res[j]=res[j]+k;
            }
        }
        int max = res[0];
        for(int l=1; l<res.length; l++)
        {
            if(res[l]>max)
                max=res[l];
        }
        return (long) max;
    }

}
