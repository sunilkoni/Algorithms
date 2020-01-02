package com.data.trees;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(3);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(11);

		Node lca = getLowestCommonAncestor(root, root.right.right, root.right.left);
		System.out.println(lca.data);
	}

	private static Node getLowestCommonAncestor(Node root, Node right, Node left) 
	{
		if(root == null)
			return null;
		if(root.data == right.data || root.data == left.data)
			return root;
		Node leftNode = getLowestCommonAncestor(root.left, right, left);
		Node rightNode = getLowestCommonAncestor(root.right, right, left);
		
		if(leftNode != null && rightNode != null)
			return root;
		return leftNode != null ? leftNode : rightNode;
	}


}
