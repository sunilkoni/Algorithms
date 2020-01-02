package com.data.trees;

public class SumOfPathOfTree {

	public static void main(String[] args) {
		Node root = new Node(45);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.left.left = new Node(2);
		root.left.left.right = new Node(15);
		root.left.right = new Node(25);
		root.right = new Node(55);
		root.right.left = new Node(50);
		root.right.right = new Node(60);
		root.right.left.left = new Node(49);
		root.right.left.right = new Node(53);
		root.right.right.left = new Node(59);
		root.right.right.right = new Node(65);
		
		inOrder(root); //inroder of BST is always sorted
		System.out.println();
		int sum = sumOfPathBetweenNodes(root, 15, 53);
		//System.out.println();
		System.out.println(sum);
		
	}
	
	private static int sumOfPathBetweenNodes(Node node, int i, int j) 
	{
		if(node == null)
			return 0;
		if(node.data == i) {
			//System.out.println(node.data+", "+(node.data+i));
			return node.data;
		}
			
		else if (node.data == j) {
			//System.out.println(node.data+", "+(node.data+j));
			return node.data;
		}
			
		
		int left = sumOfPathBetweenNodes(node.left, i, j);
		//System.out.println(left);
		int right = sumOfPathBetweenNodes(node.right, i, j);
		//System.out.println(right);
		if(left!=0 || right != 0)
			return left+right+node.data;
		return 0;
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
