package com.algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	private int V; // total vertices
	LinkedList<Integer> adj[];
	public DFS(int n) {
		V = n;
		adj = new LinkedList[V];
		for(int i=0; i<n; i++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	
	private void addEdge(int i, int j) 
	{
		LinkedList<Integer> edges = adj[i];
		edges.add(j);
	}
	
	public static void main(String[] args) 
	{
		DFS dfs = new DFS(6); 
        dfs.addEdge(5, 2); 
        dfs.addEdge(5, 0); 
        dfs.addEdge(4, 0); 
        dfs.addEdge(4, 1); 
        dfs.addEdge(2, 3); 
        dfs.addEdge(3, 1); 
  
        dfs.printDFS(5);
	}

	private void printDFS(int i) {
		boolean[] visited = new boolean[V];
		
		printDFSUtil(visited, i);
	}

	private void printDFSUtil(boolean[] visited, int i)
	{
		visited[i] = true;
		System.out.print(i+" ");
		Iterator<Integer> itr = adj[i].iterator();
		while(itr.hasNext())
		{
			int curr = itr.next();
			if(!visited[curr])
				printDFSUtil(visited, curr);
		}
		
	}

}
