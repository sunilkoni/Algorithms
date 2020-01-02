package com.algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphPrintAllPaths {

    public void print(Graph1 Graph1, int start, int end, String path, boolean[] visited)
    {
        String newPath = path.equals("") ?  ""+start : path + "->"+start;
        visited[start] = true;
        LinkedList<Node> list = Graph1.adjacencyList[start];
        for (int i = 0; i <list.size() ; i++) 
        {
            Node node = list.get(i);
            if(node.destination!=end && visited[node.destination]==false)
            {
//                visited[node.destination] = true;
                print(Graph1,node.destination,end,newPath,visited);
            }
            else if(node.destination==end)
            {
                System.out.println(newPath + "->" + node.destination);
            }
        }
        //remove from path
        visited[start] = false;
    }

    public void printAllPaths(Graph1 Graph1, int start, int end){
        boolean[] visited = new boolean[Graph1.vertices];
        visited[start] = true;
        print(Graph1, start, end, "", visited);
    }

    public static void main(String[] args) 
    {
        int vertices = 6;
        Graph1 Graph1 = new Graph1(vertices);
        Graph1.addEdge(0, 1);
        Graph1.addEdge(0, 2);
        Graph1.addEdge(1, 2);
        Graph1.addEdge(1, 3);
        Graph1.addEdge(3, 4);
        Graph1.addEdge(2, 3);
        Graph1.addEdge(4, 0);
        Graph1.addEdge(4, 1);
        Graph1.addEdge(4, 5);
        GraphPrintAllPaths p = new GraphPrintAllPaths();
        p.printAllPaths(Graph1,0,5);
        printBFS(Graph1, 0);
        printDFS(Graph1, 0);
    }

	private static void printDFS(Graph1 graph1, int start) 
	{
		StringBuilder bfs = new StringBuilder();
		//bfs.append(start+" ");
		boolean[] visited = new boolean[graph1.vertices];
		Stack<Integer> st = new Stack<>();
		st.push(start);
		visited[start] = true;
		while(!st.isEmpty())
		{
			int cur = st.pop();
			bfs.append(cur+" ");
			LinkedList<Node> adjecentNodes = graph1.adjacencyList[cur];
			Iterator<Node> itr = adjecentNodes.iterator();
			while(itr.hasNext())
			{
				Node n = itr.next();
				if(!visited[n.destination])
				{
					st.push(n.destination);
					visited[n.destination] = true;
				}
			}
		}
		System.out.println("The DFS of this Graph is : ");
		System.out.println(bfs.toString());
	}

	private static void printBFS(Graph1 graph1, int start) 
	{
		StringBuilder bfs = new StringBuilder();
		bfs.append(start+" ");
		boolean[] visited = new boolean[graph1.vertices];
		Queue<Integer> verticesQ = new LinkedList<>();
		visited[start] = true;
		verticesQ.add(start);
		while(!verticesQ.isEmpty())
		{
			int cur = verticesQ.remove();
			LinkedList<Node> adjecentNodes = graph1.adjacencyList[cur];
			Iterator<Node> itr = adjecentNodes.iterator();
			while(itr.hasNext())
			{
				Node n = itr.next();
				if(!visited[n.destination])
				{
					verticesQ.add(n.destination);
					visited[n.destination] = true;
					bfs.append(n.destination+" ");
				}
			}
		}
		System.out.println("The BFS of this Graph is : ");
		System.out.println(bfs.toString());
	}
}

class Graph1
{
    int vertices;
    LinkedList<Node> [] adjacencyList;

    public Graph1(int vertices){
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i <vertices; i++) {
            adjacencyList[i] = new LinkedList<Node>();
        }
    }

    public void addEdge(int source, int destination){
        Node node = new Node(source, destination);
        //add edge
        adjacencyList[source].addLast(node);
    }
}

class Node{
    int source;
    int destination;

    public Node(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}
