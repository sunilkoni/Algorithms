package com.data.linkedlist;

public class DoublyLinkedListOps {
	static DNode head = new DNode();
	static DNode tail = new DNode();
	public static void main(String[] args) {
		head.next = tail;
		tail.prev = head;
		final String str;
		str="Sunil";
		System.out.println(str);
		//str="Vijay";
		
		addToFrontOfDLL(new DNode(1));
		addToFrontOfDLL(new DNode(2));
		addToFrontOfDLL(new DNode(4));
		addToFrontOfDLL(new DNode(5));
		addToFrontOfDLL(new DNode(4));
		addAtGivenPos(new DNode(3), 4);
		DNode.printLinkedList(head);
		deleteANode(4);
		DNode.printLinkedList(head);
		deleteANode(3);
		DNode.printLinkedList(head);
	}
	
	public static void addToFrontOfDLL(DNode node)
	{
		node.next = head.next;
		head.next = node;
		node.prev = head;
		node.next.prev = node;
	}
	
	public static void addAtGivenPos(DNode node, int pos)
	{
		int count = pos;
		DNode cur = head;
		while(count>1)
		{
			cur = cur.next;
			count--;
		}
		node.next = cur.next;
		cur.next = node;
		node.prev = cur;
		node.next.prev = node;
	}
	
	public static void deleteANode(int data)
	{
		DNode cur = head;
		while(cur != null && cur.data != data)
		{
			cur = cur.next;
		}
		cur.prev.next = cur.next;
		cur.next.prev = cur.prev;
		cur = null;
	}
	
}
