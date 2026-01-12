package com.prepare.easyProblems;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Using StringBuilder
		String original = "Rajesh";
		
		StringBuilder sb = new StringBuilder(original);
		sb = sb.reverse();
		
		System.out.println("Reversed String " + sb.toString());
		
//		String original = "He is a good cricketer";
//		String reversed = "";
//		
//		for (int i = original.length()-1;i>=0;i--) {
//			reversed += original.charAt(i);
//			
//		}
//		
//		System.out.println("Reversed String " + reversed);
		
		
	}

}
