package com.data.trees;

public class HeightOfBT {

	public static void main(String[] args) {
		int maxLevel = 0;
		Node root = new Node(1);
		root.left = new Node(2);
		//root.right = new Node(3);
		root.left.left = new Node(4);
		//root.left.right = new Node(5);
		
		System.out.println(heightOfBT(root, maxLevel));
	}

	private static int heightOfBT(Node node, int curLevel) {
		if(node == null)
			return 0;
		
		int leftH = heightOfBT(node.left, curLevel+1);
		int rightH = heightOfBT(node.right, curLevel+1);
		
		return 0;
	}

}
