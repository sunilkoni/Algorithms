package com.data.trees;

import com.data.linkedlist.LinkedNode;

public class SumOfNumberInLinkedList {

	public static void main(String[] args) {
		LinkedNode firstHead = new LinkedNode(5);
		firstHead.next = new LinkedNode(8);
		firstHead.next.next = new LinkedNode(8);
		firstHead.next.next.next = new LinkedNode(3);
		
		LinkedNode secondHead = new LinkedNode(6);
		secondHead.next = new LinkedNode(9);
		secondHead.next.next = new LinkedNode(1);
		secondHead.next.next.next = new LinkedNode(7);
		
		firstHead = reverseLinkedList(firstHead);
		secondHead = reverseLinkedList(secondHead);
		System.out.println("Reversed 1st LinkedLL");
		printLinkedList(firstHead);
		System.out.println();
		System.out.println("Reversed 2nd LinkedLL");
		printLinkedList(secondHead);
		
		LinkedNode res = sumOfLinkedList(firstHead, secondHead);
		System.out.println();
		System.out.println("sum of LinkedLL");
		printLinkedList(res);
		
		
	}

	private static LinkedNode sumOfLinkedList(LinkedNode firstHead, LinkedNode secondHead) 
	{
		LinkedNode res = null;
		LinkedNode curr = null;
		int sum=0, carry=0, rem=0;
		while(firstHead != null || secondHead!= null)
		{
			sum = firstHead.data + secondHead.data+carry;
			carry = sum/10;
			rem = sum%10;
			if(res == null) 
			{
				res = new LinkedNode(rem);
				curr = res;
			}
			else 
			{
				curr.next = new LinkedNode(rem);
				curr = curr.next;
			}
			firstHead = firstHead.next;
			secondHead = secondHead.next;
		}
		if(carry != 0)
		{
			curr.next = new LinkedNode(carry);
			curr = curr.next;
		}
		res = reverseLinkedList(res);
		return res;
	}

	private static void printLinkedList(LinkedNode head) {
		while(head != null)
		{
			System.out.print(head.data);
			head = head.next;
		}
	}

	private static LinkedNode reverseLinkedList(LinkedNode head) 
	{
		LinkedNode prev = null;
		LinkedNode curr = head;
		LinkedNode next = null;
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	

}
