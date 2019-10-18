package com.data.trees;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.left.left = new Node(7);
		root.left.right = new Node(5);
		
		root.right = new Node(3);
		root.right.left = new Node(12);
		root.right.right = new Node(15);
		root.right.right.left = new Node(14);
		
		printLevelOrder(root);
	}

	private static void printLevelOrder(Node root) {
		int height = getHeight(root);
		System.out.println(height);
		for(int i=1; i<=height; i++)
		{
			printLevel(root,i);
		}
	}

	private static void printLevel(Node root, int level) {
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.data+" ");
		printLevel(root.left, level-1);
		printLevel(root.right, level-1);
	}

	private static int getHeight(Node node) {
		if(node == null)
			return 0;
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		
		if(left<right)
			return right+1;
		return left+1;
	}

}
