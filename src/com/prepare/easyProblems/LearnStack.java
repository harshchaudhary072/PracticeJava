package com.prepare.easyProblems;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(7);
		stack.push(4);
		stack.peek();
//		stack.pop();
		stack.contains(3);
		
		System.out.println(stack.contains(7));

	}

}
