package com.data.trees;

public class CheckIfMirror {

	/*				  root1				root2
	 * 					80               80
	 * 				   /  \             /  \
	 * 				  40  90           90  40
	 * 				 / \    \		  /    / \
	 *  			20 50   110		 110  50 20
	 * 		
	 */
	public static void main(String[] args) 
	{
		Node root1 = new Node(80);
		root1.left = new Node(40);
		root1.left.left = new Node(20);
		root1.left.right = new Node(50);
		
		root1.right = new Node(90);
		root1.right.right = new Node(110);
		
		Node root2 = new Node(80);
		root2.left = new Node(90);
		root2.left.left = new Node(110);
		
		root2.right = new Node(40);
		root2.right.left = new Node(50);
		root2.right.right = new Node(20);
		
		System.out.println("PreOrderTraversal of root");
		TreeTraversalUtil.printPreOrder(root1);
		
		System.out.println("\nPreOrderTraversal of root");
		TreeTraversalUtil.printPreOrder(root2);
		
		System.out.println(checkIfMirror(root1, root2)? "\nBoth Trees are mirror" : "\nBoth trees are not mirror");
	}

	private static boolean checkIfMirror(Node root1, Node root2) 
	{
		if((root1 == null && root2 != null) || (root1 != null && root2 == null))
			return false;
		if(root1.data != root2.data)
			return false;
		checkIfMirror(root1.left, root2.right);
		checkIfMirror(root1.right, root2.left);
		return true;
	}

}
