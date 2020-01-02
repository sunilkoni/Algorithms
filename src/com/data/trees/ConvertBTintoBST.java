package com.data.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConvertBTintoBST {

	static List<Node> preOrderList = new ArrayList<Node>();
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(11);
		root.right = new Node(12);
		root.left.left = new Node(8);
		root.left.right = new Node(13);
		root.left.left.left = new Node(7);
		root.right.left = new Node(5);
		root.right.right = new Node(14);
		
		printPreOrder(root);
		putAllNodesInList(root);
		//Collections.sort(preOrderList, Comparator<Node>);
		Node rootBT = constructBT(preOrderList, 0, preOrderList.size()-1);
		printPreOrder(rootBT);
	}


	private static Node constructBT(List<Node> preOrderList2, int start, int end) {
		if(start > end)
			return null;
		int mid = (start+end)/2;
		Node root = preOrderList2.get(mid);
		root.left = constructBT(preOrderList, start, mid-1);
		root.right = constructBT(preOrderList, mid+1, end);
		return root;
	}


	private static void putAllNodesInList(Node root) {
		if(root == null)
			return;
		putAllNodesInList(root.left);
		preOrderList.add(root);
		putAllNodesInList(root.right);
	}

	private static void printPreOrder(Node root) {
		if(root == null)
			return;
		printPreOrder(root.left);
		System.out.println(root.data);
		printPreOrder(root.right);
	}

}
