package com.blume.interview;

import com.data.linkedlist.LinkedNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(1);
		head.next = new LinkedNode(2);
		head.next.next = new LinkedNode(3);
		head.next.next.next = new LinkedNode(4);
		
		LinkedNode.printLinkedList(head);
		LinkedNode newHead = reverseLiknkedList(head);
		LinkedNode.printLinkedList(newHead);
	}

	private static LinkedNode reverseLiknkedList(LinkedNode head) 
	{
		LinkedNode cur = head;
		LinkedNode next = null;
		LinkedNode prev = null;
		
		while(cur != null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		return prev;
	}

}
