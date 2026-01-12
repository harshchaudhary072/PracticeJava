package com.prepare.easyProblems;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int factorial = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = scanner.nextInt();
		
		for (int i=n;i>0;i--) {
			factorial = factorial * i;
		}
		
		System.out.println("factorial of " + n + " = " + factorial);
		

	}

}
