package com.data.trees;

public class SumOfAllEvenInBT {
	static int sum=0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.left.left = new Node(7);
		root.left.right = new Node(5);
		
		root.right = new Node(3);
		root.right.left = new Node(12);
		root.right.right = new Node(15);
		root.right.right.left = new Node(14);
		
		sumOfAllNodes(root);
		System.out.println(sum);
	}

	private static void sumOfAllNodes(Node node) {
		
		if(node==null)
			return;
		else if(node.data %2 == 0)
			sum+=node.data;
		
		sumOfAllNodes(node.left);
		sumOfAllNodes(node.right);
	}
}
