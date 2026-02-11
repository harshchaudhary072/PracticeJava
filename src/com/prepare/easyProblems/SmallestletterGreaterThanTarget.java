package com.prepare.easyProblems;

public class SmallestletterGreaterThanTarget {

	public static void main(String[] args) {
		// What is Smallest letter greater than target?
		// Given a characters array letters that is sorted in non-decreasing order and a character target,
		// return the smallest character in the array that is larger than target.
		
		char[] letters = {'c','d','e','f','j'};
		char target = 'a';
		
		char result = smallestLetterGreaterThanTarget(letters, target);
		System.out.println("Smallest letter greater than target is: " + result);

	}

	private static char smallestLetterGreaterThanTarget(char[] letters, char target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = letters.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(letters[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return letters[start % letters.length];
	}

}
