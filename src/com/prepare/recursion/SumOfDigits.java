package com.prepare.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int sum = sumOfDigits(n);
		System.out.println("Sum of digits of " + n + " is: " + sum);

	}
	
	public static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10) + sumOfDigits(n / 10);
	}

}
