package com.algos.graphs;

public class Point {
	int x;
	int y;
	int dist;
	
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() 
	{
		return "(" + x +"," + y +") -> "+dist;
	}
	
	
}
