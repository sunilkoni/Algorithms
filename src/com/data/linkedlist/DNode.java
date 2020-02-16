package com.data.linkedlist;

public class DNode 
{
	public int data;
	public DNode next;
	public DNode prev;
	
	public DNode(int i) {
		data = i;
	}

	public DNode() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printLinkedList(DNode head) {
		System.out.println("Contents of DoublyLinkedlist : ");
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
}
