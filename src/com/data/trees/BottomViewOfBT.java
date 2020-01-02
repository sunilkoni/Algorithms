package com.data.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBT {

	public static void main(String[] args) {
		Node root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(5); 
        root.left.right = new Node(3); 
        root.right.left = new Node(4); 
        root.right.right = new Node(25); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        System.out.println("Bottom view of the given binary tree:"); 
        bottomView(root); 
	}

	private static void bottomView(Node root) {
		if(root == null)
			return;
		TreeMap<Integer, Integer> bottomNodes = new TreeMap<>();
		int hd=0;
		root.hd=hd;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node n = q.remove();
			bottomNodes.put(n.hd, n.data);
			if(n.left != null) {
				n.left.hd = n.hd-1;
				q.add(n.left);
			}
				
			if(n.right != null)
			{
				n.right.hd = n.hd+1;
				q.add(n.right);
			}
				
		}
		System.out.println(bottomNodes.values());
	}
	
	

}
