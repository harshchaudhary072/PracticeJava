package com.prepare.easyProblems;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("hello", "world")); // false


	}
	
	    public static boolean isAnagram(String s1, String s2) {
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        if (s1.length() != s2.length()) return false;

	        Map<Character, Integer> countMap = new HashMap<>();

	        // Count characters in s1
	        for (char c : s1.toCharArray()) {
	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	        }

	        // Subtract counts using s2
	        for (char c : s2.toCharArray()) {
	            if (!countMap.containsKey(c)) return false;
	            countMap.put(c, countMap.get(c) - 1);
	            if (countMap.get(c) == 0) countMap.remove(c);
	        }

	        return countMap.isEmpty();
	    }
}
