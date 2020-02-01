package com.data.trees;

/*
 * 				 8
 * 			   /   \
 * 			  4	   10
 * 			 / \   / \
 * 			3  10  9  11
 */
public class IsBinarySearchTree {

	public static void main(String[] args)
	{
		
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(11);
		
		Node root1 = new Node(8);
		root1.left = new Node(4);
		root1.left.left = new Node(3);
		root1.left.right = new Node(10);
		root1.right = new Node(10);
		root1.right.left = new Node(9);
		root1.right.right = new Node(11);
		
		if(isBinaryTree(root))
			System.out.println("root is BST");
		else
			System.out.println("root is not BST");
		
		if(isBinaryTree(root1))
			System.out.println("root1 is BST");
		else
			System.out.println("root1 is not BST");

	}


	private static boolean isBinaryTree(Node node)
	{
		return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBSTUtil(Node node, int minValue, int maxValue) 
	{
		if(node == null)
			return true;
		if(node.data < minValue || node.data > maxValue)
			return false;
		if(isBSTUtil(node.left, minValue, node.data) 
				&& isBSTUtil(node.right, node.data, maxValue))
			return true;
		else
			return false;
	}

}
