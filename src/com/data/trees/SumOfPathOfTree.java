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
		
		TreeTraversalUtil.inOrder(root); //inroder of BST is always sorted
		System.out.println();
		int sumCorrect = sumOfPathBetweenNodes(getLowestCommonAncestor(root, 15, 53), 15, 53);
		System.out.println(sumCorrect);
		
	}
	
	private static int sumOfPathBetweenNodes(Node node, int i, int j) 
	{
		if(node == null)
			return 0;
		if(node.data == i || node.data == j) {
			return node.data;
		}
			
		
		int left = sumOfPathBetweenNodes(node.left, i, j);
		int right = sumOfPathBetweenNodes(node.right, i, j);
		if(left!=0 || right != 0)
			return left+right+node.data;
		return 0;
	}

	private static Node getLowestCommonAncestor(Node root, int right, int left) 
	{
		if(root == null)
			return null;
		if(root.data == right || root.data == left)
			return root;
		Node leftNode = getLowestCommonAncestor(root.left, right, left);
		Node rightNode = getLowestCommonAncestor(root.right, right, left);
		
		if(leftNode != null && rightNode != null)
			return root;
		return leftNode != null ? leftNode : rightNode;
	}

}
