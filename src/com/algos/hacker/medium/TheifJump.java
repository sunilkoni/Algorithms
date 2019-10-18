package com.algos.hacker.medium;

public class TheifJump {

	public static void main(String[] args) {
		int x = 10, y = 1; 
        int height[] = { 11, 10, 10, 9 }; 
        int n = height.length; 
        System.out.println(jumpcount(x, y, n, height));

	}

	private static int jumpcount(int x, int y, int n, int[] height) {
		int jumps=0;
		int actualJump = x-y;
		for(int i=0; i<height.length; i++)
		{
			int h = height[i];
			if(h==x) {
				jumps++;
				continue;
			}
			while(h>0) {
				h=h-actualJump;
				jumps++;
			}
		}
		return jumps;
	}

}
