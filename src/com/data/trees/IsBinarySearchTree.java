package com.data.trees;

public class IsBinarySearchTree {

	static boolean isBST=true;
	static Node mRoot = null; 
	public static void main(String[] args) {
		
		Node root = new Node(8);
		mRoot = root;
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(11);
		
		isBinaryTree(root);
		if(isBST)
			System.out.println("YES");
		else
			System.out.println("NO");

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
