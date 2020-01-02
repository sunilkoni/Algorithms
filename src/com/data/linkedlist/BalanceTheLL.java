package com.data.linkedlist;

public class BalanceTheLL {

	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(1);
		head.next = new LinkedNode(2);
		head.next.next = new LinkedNode(7);
		head.next.next.next = new LinkedNode(10);
		head.next.next.next.next = new LinkedNode(1);
		head.next.next.next.next.next = new LinkedNode(6);
		head.next.next.next.next.next.next = new LinkedNode(3);
		
		LinkedNode node = getBalancedPoint(head);
		System.out.println("The balanced point in above linkedlist is "+node.data);

	}

	private static LinkedNode getBalancedPoint(LinkedNode head) 
	{
		int totalSum = 0;
		LinkedNode curr = head;
		
		while(curr != null)
		{
			totalSum += curr.data;
			curr = curr.next;
		}
		curr = head;
		int currSum = 0;
		while(curr != null)
		{
			currSum += curr.data;
			if(currSum == (totalSum - curr.data))
				break;
			curr = curr.next;
		}
		return curr;
	}

}
