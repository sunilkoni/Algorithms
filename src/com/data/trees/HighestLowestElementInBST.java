package com.data.trees;

public class HighestLowestElementInBST {

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(12);
		
		highest(root);
		lowest(root);
	}

	private static void highest(Node node) {
		
		while(node.right != null)
			node = node.right;
		System.out.println(node.data);
	}
	
	private static void lowest(Node node) {
		
		while(node.left != null)
			node = node.left;
		System.out.println(node.data);
	}

}
