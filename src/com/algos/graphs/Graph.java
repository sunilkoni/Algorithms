package com.algos.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	private int V; // total vertices
	LinkedList<Integer> adj[];
	public Graph(int n) {
		V = n;
		adj = new LinkedList[V];
		for(int i=0; i<n; i++)
		{
			adj[i] = new LinkedList<>();
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2); 
        //g.DFS(2);
        
        Graph gtopo = new Graph(6); 
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
		
	}

	private void DFS(int i) {
		
	}

	private void BFS(int source) 
	{
		boolean[] vistedArr = new boolean[V];
		Queue<Integer> tempQ = new LinkedList<>();
		vistedArr[source] = true;
		tempQ.add(source);
		
		while(!tempQ.isEmpty())
		{
			int curr = tempQ.remove();
			System.out.print(curr+" ");
			LinkedList<Integer> connectedEdges = adj[curr];
			for(Integer currEdge : connectedEdges)
			{
				if(!vistedArr[currEdge])
				{
					tempQ.add(currEdge);
					vistedArr[currEdge] = true;
				}
					
			}
		}
	}

	private void addEdge(int i, int j) 
	{
		LinkedList<Integer> edges = adj[i];
		edges.add(j);
	}

}
