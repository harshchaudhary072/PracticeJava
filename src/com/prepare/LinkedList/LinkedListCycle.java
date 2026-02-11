package com.prepare.LinkedList;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//What is a cycle in a linked list?
		//A cycle in a linked list occurs when a node's next pointer points to a previous node in the list, creating a loop. This means that if you traverse the linked list, you will eventually encounter the same node again, leading to an infinite loop.
		
		//How to detect a cycle in a linked list?
		//There are several algorithms to detect a cycle in a linked list, but one of the most common is Floyd's Tortoise and Hare algorithm. This algorithm uses two pointers, one slow (the tortoise) and one fast (the hare). The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a cycle, the fast pointer will eventually meet the slow pointer. If there is no cycle, the fast pointer will reach the end of the list.
		// how to find length of the cycle in a linked list?
		//To find the length of the cycle in a linked list, you can use the following steps:
		//1. First, use Floyd's Tortoise and Hare algorithm to detect the cycle and find the meeting point of the slow and fast pointers.
		//2. Once you have the meeting point, keep one pointer at the meeting point and move the other pointer one step at a time until they meet again. Count the number of steps taken to meet again, which will give you the length of the cycle.
		//Example of a cycle in a linked list:
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		head.next = second;
		second.next = third;
		third.next = second;
		
		
		//Detecting the cycle
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next; // Move slow pointer by 1
			fast = fast.next.next; // Move fast pointer by 2
			int length = 0;
			length++;
			if (slow == fast) {
				System.out.println("Cycle detected!" + " Length of the cycle: " + length);
				return;
			}
		}
		
		System.out.println("No cycle detected.");

	}
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

}
