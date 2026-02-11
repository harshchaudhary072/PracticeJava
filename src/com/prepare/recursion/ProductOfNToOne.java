package com.prepare.recursion;

public class ProductOfNToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int product = productOfNToOne(n);
		System.out.println("Product of numbers from " + n + " to 1 is: " + product);

	}
	
	public static int productOfNToOne(int n) {
		if (n == 1) {
			return 1;
		}
		return n * productOfNToOne(n - 1);
	}

}
