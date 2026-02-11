package com.prepare.LinkedList;

public class DLL {
	
	Node head;
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void addFirst(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			return;
		}
		
		node.next = head;
		head.prev = node;
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
		node.prev = temp;
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
		if (temp.next != null) {
			temp.next.prev = node;
		}
		temp.next = node;
		node.prev = temp;
	}
	
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		
		Node toDelete = temp.next;
		if (toDelete != null) {
			temp.next = toDelete.next;
			if (toDelete.next != null) {
				toDelete.next.prev = temp;
			}
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

}
