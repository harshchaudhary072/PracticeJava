package com.prepare.recursion;

public class OneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printOneToN(n);
	}
	
	public static void printOneToN(int n) {
		if (n == 0) {
			return;
		}
		printOneToN(n - 1);
		System.out.println(n);
	}

}
