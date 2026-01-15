package com.prepare.easyProblems;

public class FindMinMaxInArray {

	public static void main(String[] args) {
		int[] arr = {4,5,8,7,12,2};
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum element in array is " + min);
		System.out.println("Maximum element in array is " + max);

	}

}
