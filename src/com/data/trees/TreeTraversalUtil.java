package com.data.trees;

public class TreeTraversalUtil 
{
	public static void printPreOrder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
}
