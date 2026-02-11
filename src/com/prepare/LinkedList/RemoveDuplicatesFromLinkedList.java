package com.prepare.LinkedList;

import java.util.LinkedList;

import com.prepare.LinkedList.LL.Node;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
//		LL list = new LL();
//		list.addLast(1);
//		list.addLast(1);
//		list.addLast(2);
//		list.addLast(3);
//		list.addLast(3);
//		
//		list.printList();
//		
//		System.out.println("\nAfter removing duplicates: ");
//		
//		Node current = list.head;
//		while(current != null && current.next != null) {
//			if (current.val == current.next.val) {
//				current.next = current.next.next;
//			} else {
//				current = current.next;
//			}
//		}
//		
//		list.printList();
		
		
		LinkedList<Integer> list = new LinkedList();
		list.addLast(1);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(3);
		
//		list.stream().distinct().forEach(System.out::println);
		
		LinkedList<Integer> uniqueList = new LinkedList<>();
		for (Integer num : list) {
			if (!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		
		System.out.println(uniqueList);
		

	}

}
