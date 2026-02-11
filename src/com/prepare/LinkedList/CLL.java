package com.prepare.LinkedList;

public class CLL {
	
	Node head;
	
	public class Node{
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
			node.next = head;
			return;
		}
		
		node.next = head;
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		temp.next = node;
		head = node;
	}
	
	public void addLast(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			node.next = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		temp.next = node;
		node.next = head;
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
	
	public void deleteAt(int index) {
		if (index == 0) {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
	}
	
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node temp = head;
		do {
			System.out.print(temp.val + "-> ");
			temp = temp.next;
		} while(temp != head);
		
		System.out.println();
	}

}
