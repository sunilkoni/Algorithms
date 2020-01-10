package com.algos.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreasureIsland {

	public static void main(String[] args) {
		int[][] island = {
							{0,0,0,0},
							{9,0,9,0},
							{0,0,0,0},
							{1,9,9,0}
						 };
		List<Point> path = getShortestPath(island, new Point(0, 0));
				
	}

	private static List<Point> getShortestPath(int[][] island, Point point) 
	{
		Queue<Point> qPoints = new LinkedList<Point>();
		boolean[][] visited = new boolean[4][4];
		//Arrays.fill(visited, false);
		qPoints.add(point);
		while(!qPoints.isEmpty())
		{
			Point cur = qPoints.remove();
			isValid(cur.x-1, cur.y, island, visited, qPoints);
			isValid(cur.x, cur.y-1, island, visited, qPoints);
			isValid(cur.x+1, cur.y, island, visited, qPoints);
			isValid(cur.x, cur.y+1, island, visited, qPoints);
		}
		return null;
	}

	private static void isValid(int x, int y, int[][] island, boolean[][] visited, Queue<Point> qPoints) {
		try {
			if(!(x<0) && !(y<0) && !(x>4) && !(y>4) && island[x][y] == 1)
				System.out.println("End"+qPoints);
			else if(!(x<0) && !(y<0) && !(x>4) && !(y>4) && !visited[x][y] && island[x][y] != 9)
			{
				visited[x][y] = true;
				qPoints.add(new Point(x, y));
			}
		} catch (Exception e) {
			System.out.println("Exception" + new Point(x, y));
			System.exit(0);
		}
			
	}

}
