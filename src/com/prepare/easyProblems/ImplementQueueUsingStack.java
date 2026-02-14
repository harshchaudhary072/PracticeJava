package com.prepare.easyProblems;

import java.util.Stack;

public class ImplementQueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyQueue queue = new MyQueue();
	        queue.push(7);
	        queue.push(2);
	        System.out.println(queue.peek()); // returns 1
	        System.out.println(queue.pop());  // returns 1
	        System.out.println(queue.empty()); // returns false

	}
	
	
	public static class MyQueue {
		
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;
		
		public MyQueue() {
			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}
		
		public void push(int x) {
			stack1.push(x);
		}
		
		public int pop() {
			if (stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
			return stack2.pop();
		}
		
		public int peek() {
			if (stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
			return stack2.peek();
		}
		public boolean empty() {
			return stack1.isEmpty() & stack2.isEmpty();
		}
	}
	
	
}
