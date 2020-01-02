package com.data.linkedlist;

public class FindNthItemFromBack {

	public static void main(String[] args) 
	{
		LinkedNode head = new LinkedNode(1);
		head.next = new LinkedNode(2);
		head.next.next = new LinkedNode(3);
		head.next.next.next = new LinkedNode(4);
		head.next.next.next.next = new LinkedNode(3);
		head.next.next.next.next.next = new LinkedNode(5);
		head.next.next.next.next.next.next = new LinkedNode(1);
		head.next.next.next.next.next.next.next = new LinkedNode(6);
		
		LinkedNode.printLinkedList(head);
		
		LinkedNode nthNode = getNthNode(head, 4);
		System.out.println(nthNode.data);
	}

	private static LinkedNode getNthNode(LinkedNode head, int n) 
	{
		LinkedNode first = head;
		LinkedNode second = head;
		while(n>0)
		{
			first = first.next;
			n--;
		}
		while(first != null)
		{
			second = second.next;
			first = first.next;
		}
		return second;
	}

}
