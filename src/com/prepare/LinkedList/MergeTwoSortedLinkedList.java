package com.prepare.LinkedList;

import com.prepare.LinkedList.LL.Node;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list1 = new LL();
		list1.addLast(1);
		list1.addLast(3);
		list1.addLast(5);
		list1.printList();
		
		LL list2 = new LL();
		list2.addLast(2);
		list2.addLast(4);
		list2.addLast(6);
		list2.printList();
		
		LL list3 = new LL();
		mergeTwoSortedLists(list1, list2);
		

	}
	
	public static void mergeTwoSortedLists(LL list1, LL list2) {
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		
		LL mergedList = new LL();
		
		while(temp1 != null && temp2 != null) {
			if (temp1.val < temp2.val) {
				mergedList.addLast(temp1.val);
				temp1 = temp1.next;
			} else {
				mergedList.addLast(temp2.val);
				temp2 = temp2.next;
			}
		}
		
		while(temp1 != null) {
			mergedList.addLast(temp1.val);
			temp1 = temp1.next;
		}
		
		while(temp2 != null) {
			mergedList.addLast(temp2.val);
			temp2 = temp2.next;
		}
		
		System.out.println("Merged List: ");
		mergedList.printList();
		
	}



}
