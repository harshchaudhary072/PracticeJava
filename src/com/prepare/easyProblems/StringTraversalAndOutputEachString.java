package com.prepare.easyProblems;

import java.util.Stack;

public class StringTraversalAndOutputEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rewrite the baseball game problem using a stack and output each string in the operations array
		String[] operations = {"1","2","+","3","D","4","C"};
		
		Stack<Integer> stack = new Stack<>();
		
		for (String operation:operations) {
			System.out.println("Current operation: " + operation);
			// Try to parse as integer; if not numeric, handle as operation
			try {
				int val = Integer.parseInt(operation);
				System.out.println("Pushing " + val + " to the stack");
				stack.push(val);
			} catch (NumberFormatException e) {
				// not a number - handle operation tokens
				if (operation.equals("+")) {
					System.out.println("This is a plus sign");
					if (stack.size() >= 2) {
						int last = stack.pop();
						int secondLast = stack.pop();
						int sum = last + secondLast;
						stack.push(secondLast);
						stack.push(last);
						stack.push(sum);
						System.out.println("Pushing " + sum + " to the stack");
					} else {
						System.out.println("Not enough elements for + operation");
					}
				} else if (operation.equals("D")) {
					System.out.println("This is a D");
					if (!stack.isEmpty()) {
						int last = stack.peek();
						stack.push(last * 2);
						System.out.println("Pushing " + (last * 2) + " to the stack");
					} else {
						System.out.println("No previous score to double");
					}
				} else if (operation.equals("C")) {
					System.out.println("This is a C");
					if (!stack.isEmpty()) {
						int removed = stack.pop();
						System.out.println("Removing " + removed + " from the stack");
					} else {
						System.out.println("No previous score to remove");
					}
				} else {
					System.out.println("Unknown operation: " + operation);
				}
			}
			
			System.out.println("Current stack: " + stack);
		}
		
		// Calculate total score
		int totalScore = 0;
		for (int score : stack) {
			totalScore += score;
		}
		System.out.println("Total score: " + totalScore);
		
	}

}