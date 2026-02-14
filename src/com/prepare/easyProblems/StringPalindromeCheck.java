package com.prepare.easyProblems;

public class StringPalindromeCheck {

//	public static void main(String[] args) {
//        String str = "madam";
//        boolean isPalindrome = checkPalindrome(str);
//
//        if (isPalindrome) {
//            System.out.println(str + " is a palindrome.");
//        } else {
//            System.out.println(str + " is not a palindrome.");
//        }
//    }

//    static boolean checkPalindrome(String str) {
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
	
//	Given a string s, return true if it is a palindrome, otherwise return false.
//
//			A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
//	
	
	public static void main(String[] args) {
		String s = "Was it a car or a cat I saw?";
		
		boolean isPalindrome = checkPalindrome(s);
		
				if (isPalindrome) {
			System.out.println("\"" + s + "\" is a palindrome.");
		} else {
			System.out.println("\"" + s + "\" is not a palindrome.");
		}
	}
	
	
	
	static boolean checkPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
}