package com.data.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ConvertBSTtoBBST {
	public static void main(String[] args)  
    { 
         /* Constructed skewed binary tree is 
                10 
               / 
              8 
             / 
            7 
           / 
          6 
         / 
        5   */
        Node root = new Node(10); 
        root.left = new Node(8); 
        root.left.left = new Node(7); 
        root.left.left.left = new Node(6); 
        root.left.left.left.left = new Node(5); 
  
        root = buildTree(root); 
        System.out.println("Preorder traversal of balanced BST is :"); 
        preOrder(root); 
    }

	private static void preOrder(Node root) {
		if(root == null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	private static Node buildTree(Node root) {
		Vector<Node> nodes = new Vector<Node>();
		storeNodesInList(nodes, root);
		return buildBBST(nodes, 0, nodes.size()-1);
	}

	private static Node buildBBST(List<Node> nodes, int start, int end) {
		if(start > end)
			return null;
		int mid = (start + end)/2;
		Node root = nodes.get(mid);
		root.left = buildBBST(nodes, start, mid-1);
		root.right = buildBBST(nodes, mid+1, end);
		
		return root;
	}

	private static void storeNodesInList(List<Node> nodes, Node root) {
		if(root == null)
			return;
		storeNodesInList(nodes, root.left);
		nodes.add(root);
		storeNodesInList(nodes, root.right);
	} 
}
