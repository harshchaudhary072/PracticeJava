package com.prepare.recursion;

public class BubbleSortUsingRecursion {

	public static void main(String[] args) {
		// bubble sort using recursion
		// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
		// compares adjacent elements and swaps them if they are in the wrong order.
		
		int[] nums = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(nums, nums.length);
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}
	
	public static void bubbleSort(int[] nums, int n) {
		// base case
		if (n == 1) {
			return;
		}
		
		// one pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				// swap nums[i] and nums[i+1]
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}
		
		// largest element is fixed, recur for remaining array
		bubbleSort(nums, n - 1);
	}

}
