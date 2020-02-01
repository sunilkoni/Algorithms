package com.algos.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreasureIsland {

	static int dist = 0;
	static boolean found = false;
	static Queue<Point> paths = new LinkedList<Point>();
	public static void main(String[] args) {
		int[][] island = {
							{0,0,0,0},
							{9,0,9,0},
							{0,0,0,0},
							{1,9,9,0}
						 };
		getShortestPath(island, new Point(0, 0));
		System.out.println(dist);
		System.out.println("Path is : " + paths);
				
	}

	private static List<Point> getShortestPath(int[][] island, Point point) 
	{
		Queue<Point> qPoints = new LinkedList<Point>();
		boolean[][] visited = new boolean[4][4];
		visited[point.x][point.y] = true;
		qPoints.add(point);
		while(!qPoints.isEmpty() && !found)
		{
			Point cur = qPoints.remove();
			paths.add(cur);
			isValid(new Point(cur.x-1, cur.y), island, visited, qPoints, cur);
			isValid(new Point(cur.x, cur.y-1), island, visited, qPoints, cur);
			isValid(new Point(cur.x+1, cur.y), island, visited, qPoints, cur);
			isValid(new Point(cur.x, cur.y+1), island, visited, qPoints, cur);
		}
		return null;
	}

	private static void isValid(Point p, int[][] island, boolean[][] visited, Queue<Point> qPoints, Point cur) 
	{
		try 
		{
			if((p.x >=0 && p.y >= 0) && (p.x <=3 && p.y <= 3))
			{
				if(island[p.x][p.y] == 1)
				{
					dist = cur.dist+1;
					found = true;
				}
				else if(island[p.x][p.y] != 9 && visited[p.x][p.y] == false)
				{
					visited[p.x][p.y] = true;
					p.dist = cur.dist+1;
					qPoints.add(p);
				}
			}
			
		} catch (Exception e) 
		{
			
		}
	}

}
