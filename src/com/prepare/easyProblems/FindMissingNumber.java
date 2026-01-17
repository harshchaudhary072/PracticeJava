package com.prepare.easyProblems;

// You are given an array of size n containing numbers from 1 to n+1, but one number is missing.
//Example:
//	Input → [1, 2, 4, 5, 6]
//	Output → 3

public class FindMissingNumber {

	public static void main(String[] args) {

	
		int[] arr = {1,2,4,5,6};
		System.out.println("Missing number: "+ findMissing(arr));
	}
	
	//using SumMethod
//	public static int findMissing(int[] arr) {
//		int n = arr.length+1;
//		int expectedSum = n * (n+1)/2;
//		int actualSum = 0;
//		
//		for (int num: arr) {
//			actualSum += num;
//		}
//		
//		return expectedSum-actualSum;
//	}
	
	//Using XorMethod
	public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int xorAll = 0, xorArr = 0;

        // XOR from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all elements in array
        for (int num : arr) {
            xorArr ^= num;
        }

        return xorAll ^ xorArr;
    }


}
