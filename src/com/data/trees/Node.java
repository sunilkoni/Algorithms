package com.data.trees;

public class Node{
	int data;
	int hd;
	Node left=null;
	Node right=null;
	
	Node(int data)
	{
		this.data=data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", hd=" + hd + "]";
	}
	
	
}
