package com.data.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class LefAndRighttViewOfTree {

	/*
	 * 					80
	 * 				   /  \
	 * 				  40  90
	 * 				 / \    \
	 *  			20 50   110
	 * 					\   /
	 * 				   55  100
	 * 						\
	 * 						105
	 */
	public static void main(String[] args) 
	{
		Node root = new Node(80);
		root.left = new Node(40);
		root.left.left = new Node(20);
		root.left.right = new Node(50);
		root.left.right.right = new Node(55);
		
		root.right = new Node(90);
		root.right.right = new Node(110);
		root.right.right.left = new Node(100);
		root.right.right.left.right = new Node(105);
		
		System.out.println("InOrder of tree :");// expected 80 40 20 50 55 90 110 100 105
		preOrder(root);
		System.out.println("\n\n"+"LeftView of tree : ");//80 40 20 55 105
		leftView(root);
		
		System.out.println("\n\n"+"RightView of tree : ");//80 40 20 55 105
		rightView(root);
	}

	
	private static void preOrder(Node root) 
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	private static void leftView(Node root) 
	{
		root.hd = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node n = q.remove();
			if (!map.containsKey(n.hd)) {
				map.put(n.hd, n.data);
			}
			if(n.left != null)
			{
				n.left.hd = n.hd+1;
				q.add(n.left);
			}
			if(n.right != null)
			{
				n.right.hd = n.hd+1;
				q.add(n.right);
			}
		}
		System.out.print(map.values());
		
	}
	
	private static void rightView(Node root) 
	{
		root.hd = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node n = q.remove();
			map.put(n.hd, n.data);
			if(n.left != null)
			{
				n.left.hd = n.hd+1;
				q.add(n.left);
			}
			if(n.right != null)
			{
				n.right.hd = n.hd+1;
				q.add(n.right);
			}
		}
		System.out.print(map.values());
		
	}


}
