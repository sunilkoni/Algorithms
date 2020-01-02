package com.data.linkedlist;

public class LinkedNode {
	public int data;
	public LinkedNode next;
	
	public LinkedNode(int data) {
		super();
		this.data = data;
	}

	public LinkedNode(int data, LinkedNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public LinkedNode() {
	}

	public static void printLinkedList(LinkedNode head) {
		System.out.println("Contents of Linkedlist : ");
		StringBuilder stb = new StringBuilder();
		while(head != null)
		{
			stb.append(head.data);
			head = head.next;
			if(head!=null)
				stb.append(" - ");
		}
		System.out.println(stb.toString());
	}

	@Override
	public String toString() {
		return "LinkedNode [data=" + data + ", next=" + next + "]";
	}
	
}
