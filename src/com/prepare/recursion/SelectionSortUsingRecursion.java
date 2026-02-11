package com.prepare.recursion;

public class SelectionSortUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {64, 25, 12, 22, 11};
		selectionSort(nums);
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}
	
	public static void selectionSort(int[] nums) {
		selectionSortHelper(nums, 0);
	}
	
	public static void selectionSortHelper(int[] nums, int index) {
		// base case
		if (index == nums.length - 1) {
			return;
		}
		
		// find the minimum element in unsorted array
		int minIndex = index;
		for (int j = index + 1; j < nums.length; j++) {
			if (nums[j] < nums[minIndex]) {
				minIndex = j;
			}
		}
		
		// swap the found minimum element with the first element
		int temp = nums[minIndex];
		nums[minIndex] = nums[index];
		nums[index] = temp;
		
		// recur for remaining array
		selectionSortHelper(nums, index + 1);
	}

}
