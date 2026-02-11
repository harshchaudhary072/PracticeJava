package com.prepare.LinkedList;

import com.prepare.LinkedList.LL.Node;
import com.prepare.LinkedList.CLL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(4);
		list.insertAt(0, 3);
//		list.insertRecursion(0, 3);
		Node temp = list.head;
		while(temp != null) {
			System.out.print(temp.val + "-> ");
			temp = temp.next;
		}
		
		list.deleteAt(3);
		System.out.println("\nAfter deletion: ");
		Node temp2 = list.head;
		while(temp2 != null) {
			System.out.print(temp2.val + "-> ");
			temp2 = temp2.next;
		}

//		DLL list = new DLL();
//		list.addFirst(1);
//		list.addFirst(2);
//		list.addFirst(3);
//		list.addLast(4);
//		list.insertAt(0, 1);
//		
//		list.printList();
//		list.deleteAt(1);
//		
//		list.printList();
		
//		CLL list = new CLL();
//		list.addFirst(1);
//		list.addFirst(2);
//		list.addFirst(3);
//		list.addLast(4);
//		list.insertAt(0, 1);
//		
//		list.printList();
//		list.deleteAt(1);
//		
//		list.printList();
		
		
	}

}
