package com.data.trees;

public class MirrorABinaryTree {

	/*
	 * 				 8
	 * 			   /   \
	 * 			  4	   10
	 * 			 / \   / \
	 * 			3  10  9  11
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
			
			TreeTraversalUtil.printPreOrder(root);
			
			mirrorBT(root);
			System.out.println();
			TreeTraversalUtil.printPreOrder(root);
	}

	private static void mirrorBT(Node root) 
	{
		if(root != null)
		{
			mirrorBT(root.left);
			mirrorBT(root.right);
			
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return;
	}

}
