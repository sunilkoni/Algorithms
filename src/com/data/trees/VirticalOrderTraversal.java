package com.data.trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VirticalOrderTraversal {

	/*
	 * 				 8
	 * 			   /   \
	 * 			  4	   10
	 * 			 / \   / \
	 * 			3  5  9  11
	 * Vertical traversal : 3, 4, 8, 5, 9, 10, 11 
	 */
	public static void main(String[] args) 
	{
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(11);
		
		TreeMap<Integer, String> verticalNodesMap = getNodesVerticalOrder(root);
		for(Map.Entry<Integer, String> e : verticalNodesMap.entrySet())
		{
			System.out.println(e.getKey() + " -> "+ e.getValue());
		}
		System.out.println();
		for(Map.Entry<Integer, String> e : verticalNodesMap.entrySet())
		{
			System.out.print(e.getValue());
		}
	}

	private static TreeMap<Integer, String> getNodesVerticalOrder(Node root) 
	{
		TreeMap<Integer, String> verticalNodesMap = new TreeMap();
		Queue<Node> q = new LinkedList<Node>();
		root.hd = 0;
		q.add(root);
		while(!q.isEmpty())
		{
			Node cur = q.remove();
			if(verticalNodesMap.get(cur.hd) != null)
				verticalNodesMap.put(cur.hd, verticalNodesMap.get(cur.hd).concat(cur.data+" "));
			else
				verticalNodesMap.put(cur.hd, cur.data+" ");
			if(cur.left != null)
			{
				cur.left.hd = cur.hd -1;
				q.add(cur.left);
			}
			if(cur.right != null)
			{
				cur.right.hd = cur.hd +1;
				q.add(cur.right);
			}
		}
		return verticalNodesMap;
	}

}
