package com.prepare.LinkedList;

public class LL {
	
	Node head;
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public void addFirst(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			return;
		}
		
		node.next = head;
		head = node;
	}
	
	public void addLast(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = node;
	}
	
	public void insertAt(int val, int index) {
		Node node = new Node(val);
		if (index == 0) {
			addFirst(val);
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		
		node.next = temp.next;
		temp.next = node;
	}
	
//	public void insertRecursion(int val, int index) {
//		head = insertRecursionHelper(val, index, head);
//		
//		Node temp = head;
//		while(temp != null) {
//			System.out.print(temp.val + "-> ");
//			temp = temp.next;
//		}
//		System.out.println();
//		// Time complexity: O(n)
//		
//		
//		
//	}
//	
//	private Node insertRecursionHelper(int val, int index, Node head2) {
//		
//		if (index == 0) {
//			Node node = new Node(val);
//			node.next = head2;
//			return node;
//		}
//		return insertRecursionHelper(val, index - 1, head2.next);
//		
//	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "-> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Node head;
//
//	class Node {
//		int data;
//		Node next;
//
//		public Node(int data) {
//			this.data = data;
//			this.next = null;
//		}
//	}
//
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			return;
//		}
//		newNode.next = head;
//		head = newNode;
//	}
//
//	public void printList() {
//		Node temp = head;
//		while (temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//		System.out.println();
//	}
}
