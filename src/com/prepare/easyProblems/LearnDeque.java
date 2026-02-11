package com.prepare.easyProblems;

import java.util.Deque;
import java.util.LinkedList;

public class LearnDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(1);
		deque.addFirst(2);
		
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());

	}

}
