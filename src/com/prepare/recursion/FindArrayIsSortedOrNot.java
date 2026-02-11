package com.prepare.recursion;

public class FindArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,1,2,3,4,5};
		boolean isSorted = isArraySorted(arr, 0);
		if(isSorted) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}

	}
	
	public static boolean isArraySorted(int[] arr, int index) {
		// base case
		if(index == arr.length - 1) {
			return true;
		}
		
		// recursive case
		if(arr[index] > arr[index + 1]) {
			return false;
		}
		
		return isArraySorted(arr, index + 1);
	}

}
