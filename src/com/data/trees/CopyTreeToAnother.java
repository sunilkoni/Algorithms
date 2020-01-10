package com.data.trees;

public class CopyTreeToAnother {
	
	/*
	 * 					80
	 * 				   /  \
	 * 				  40  90
	 * 				 / \    \
	 *  			20 50   110
	 * 		
	 */
	public static void main(String[] args) 
	{
		Node root = new Node(80);
		root.left = new Node(40);
		root.left.left = new Node(20);
		root.left.right = new Node(50);
		
		root.right = new Node(90);
		root.right.right = new Node(110);
		
		System.out.println("PreOrderTraversal of root");
		TreeTraversalUtil.printPreOrder(root);
		Node root2 = null;
		root2 = copyToAnother(root, root2);
		System.out.println("\nPreOrderTraversal of root2");
		TreeTraversalUtil.printPreOrder(root2);
	}

	private static Node copyToAnother(Node root, Node root2) 
	{
		if(root == null)
			return null;
		root2 = new Node(root.data);
		root2.left = copyToAnother(root.left, root2.left);
		root2.right = copyToAnother(root.right, root2.right);
		return root2;
	}

}
