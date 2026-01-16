package com.prepare.easyProblems;

public class CountVowelsInAString {

	public static void main(String[] args) {
		String str = "HelloJava!";
		int NumberOfVowels = VowelCount(str);
		
		System.out.println(NumberOfVowels);

	}
	
	public static int VowelCount(String str) {
		int count = 0;
		str = str.toLowerCase();
		
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if ((ch=='a') || (ch=='e') || (ch=='i') || (ch == 'o') || (ch == 'u') ) {
				count++;
			}
		}
		
		return count;
	}

}
