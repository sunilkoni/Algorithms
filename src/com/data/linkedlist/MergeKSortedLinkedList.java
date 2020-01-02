package com.data.linkedlist;

public class MergeKSortedLinkedList {

	public static void main(String[] args) 
	{
		LinkedNode l1 = new LinkedNode(1);
		l1.next = new LinkedNode(4);
		l1.next.next = new LinkedNode(7);
		l1.next.next.next = new LinkedNode(10);
		l1.next.next.next.next = new LinkedNode(13);
		
		LinkedNode l2 = new LinkedNode(2);
		l2.next = new LinkedNode(5);
		l2.next.next = new LinkedNode(8);
		l2.next.next.next = new LinkedNode(11);
		l2.next.next.next.next = new LinkedNode(14);
		
		LinkedNode l3 = new LinkedNode(3);
		l3.next = new LinkedNode(6);
		l3.next.next = new LinkedNode(9);
		l3.next.next.next = new LinkedNode(12);
		l3.next.next.next.next = new LinkedNode(15);
		
		System.out.print("1st ");
		LinkedNode.printLinkedList(l1);
		System.out.print("2nd ");
		LinkedNode.printLinkedList(l2);
		System.out.print("3rd ");
		LinkedNode.printLinkedList(l3);
		
		LinkedNode head = mergeAllLinkedList(l1, l2);
		head = mergeAllLinkedList(head, l3);
		System.out.println("Sorted list");
		LinkedNode.printLinkedList(head);
	}

	private static LinkedNode mergeAllLinkedList(LinkedNode l1, LinkedNode l2) 
	{
		
		LinkedNode head = null;
		LinkedNode p = l1;
		LinkedNode q = l2;
		LinkedNode s = null;
		if(p.data < q.data)
		{
			s = p;
			p = s.next;
		}
		else
		{
			s = q;
			q = s.next;
		}
		head = s;
		while(p != null && q != null)
		{
			if(p.data < q.data)
			{
				s.next = p;
				s = p;
				p = s.next;
			}
			else
			{
				s.next = q;
				s = q;
				q = s.next;
			}
		}
		if(p == null)
			s.next = q;
		if(q == null)
			s.next = p;
		return head;
	}

}
