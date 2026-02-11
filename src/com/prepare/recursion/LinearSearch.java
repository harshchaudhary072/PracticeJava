package com.prepare.recursion;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		int target = 21;
		int found = linearSearch(arr, target, 0);
		if (found >= arr.length) {
			System.out.println("Element " + target + " not found in the array.");
		}else {
		System.out.println("Element " + target + " found in the array" + "at index: " + found);
		}

	}
	
	public static int linearSearch(int[] arr, int target, int index) {
		
		if (index==arr.length) {
			return index;
		}
		
		if (arr[index]==target) {
			return index;
		}
		
		return linearSearch(arr, target, index+1);
	}
}
