package com.data.trees;

public class InOrderOfBT {

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(12);
		
		inOrder(root);
	}

	private static void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

}
