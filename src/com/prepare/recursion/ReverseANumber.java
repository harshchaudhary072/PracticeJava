package com.prepare.recursion;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int reversedNumber = reverseNumber(n, 0);
		System.out.println("Reversed number of " + n + " is: " + reversedNumber);

	}
	
	public static int reverseNumber(int n, int reversed) {
		if (n == 0) {
			return reversed;
		}
		reversed = reversed * 10 + n % 10;
		return reverseNumber(n / 10, reversed);
	}

}
