package com.prepare.recursion;

public class NtoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n = 5;
		printNtoOne(n);

	}

	private static void printNtoOne(int n) {
		
		if (n==0) {
			return;
		}
		
		System.out.println(n);
		printNtoOne(n-1);
	}

}
