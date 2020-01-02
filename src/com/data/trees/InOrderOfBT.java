package com.data.trees;

public class InOrderOfBT {
	static boolean isBST=true;
	static Node mRoot = null; 
	static Node nthHigh = null; 
	static int counter=0;

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(12);
		
		inOrder(root);
		
		if(isBST)
			System.out.println("YES");
		else
			System.out.println("NO");
		System.out.println(nthHigh.data);
	}

	private static void inOrder(Node node) {
		if(counter <=2)
		{
			counter++;
			nthHigh = node;
		}
		if(node==null)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
	
	private static void isBinaryTree(Node node) {
		if(node==null)
			return;
		
		if((node.left != null && !(node.data > node.left.data && mRoot.data > node.left.data)) 
				&& (node.right != null && !(node.data < node.right.data && mRoot.data < node.left.data)))
			isBST=false;
		isBinaryTree(node.left);
		isBinaryTree(node.right);
	}

}
