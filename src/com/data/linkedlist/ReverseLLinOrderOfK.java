package com.data.linkedlist;

public class ReverseLLinOrderOfK {

	
	public static void main(String[] args) 
	{
		LinkedNode head = new LinkedNode(10);
		head.next = new LinkedNode(20);
		head.next.next = new LinkedNode(30);
		head.next.next.next = new LinkedNode(40);
		head.next.next.next.next = new LinkedNode(50);
		head.next.next.next.next.next = new LinkedNode(60);
		head.next.next.next.next.next.next = new LinkedNode(70);
		head.next.next.next.next.next.next.next = new LinkedNode(80);
		head.next.next.next.next.next.next.next.next = new LinkedNode(90);
		
		LinkedNode.printLinkedList(head);
		
		LinkedNode new_head = reverseLinkedList(head);
		
		LinkedNode.printLinkedList(new_head);
	}
	
	private static LinkedNode reverseLinkedList(LinkedNode head)
	{
		LinkedNode curr = head;
		LinkedNode prev = null;
		LinkedNode next = null;
		
		while(curr!= null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

	private static LinkedNode reverseInOrderOfK(LinkedNode head, int i) 
	{
		LinkedNode curr = head;
		LinkedNode prev = null;
		LinkedNode next = null;
		
		while(curr!= null || i>0)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i--;
		}
		
		return null;
	}

}
