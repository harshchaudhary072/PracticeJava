package com.prepare.easyProblems;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
//		queue.peek();
//		queue.poll();
		
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());

	}

}
