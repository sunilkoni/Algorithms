package com.algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
	private int V; // total vertices
	LinkedList<Integer> adj[];
	public TopologicalSort(int n) {
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
		TopologicalSort gtopo = new TopologicalSort(6); 
        gtopo.addEdge(5, 2); 
        gtopo.addEdge(5, 0); 
        gtopo.addEdge(4, 0); 
        gtopo.addEdge(4, 1); 
        gtopo.addEdge(2, 3); 
        gtopo.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        gtopo.topologicalSort(); 
	}

	private void topologicalSort() 
	{
		Stack<Integer> st = new Stack<>();
		boolean[] visited = new boolean[V];
		//mark all vertices as not visited
		for(int i=0; i<V; i++)
			visited[i] = false;
		
		for(int i=0; i<V; i++)
		{
			if(visited[i] != true)
				topologicalUtil(i, st, visited);
		}
		
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+ " ");
		}
		
	}

	private void topologicalUtil(int v, Stack<Integer> st, boolean[] visited)
	{
		visited[v] = true;
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext())
		{
			int curr = itr.next();
			if(!visited[curr])
				topologicalUtil(curr, st, visited);
		}
		st.add(v);
	}

}
