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
	
	public static void inOrder(Node node)
	{
		if(node == null)
			return ;
		inOrder(node.left);
		System.out.print(node.data +" ");
		inOrder(node.right);
	}
}
