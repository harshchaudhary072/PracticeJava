package com.prepare.easyProblems;

public class SelectionSort {

	public static void main(String[] args) {
		// What is Selection Sort?
		// Selection Sort is a simple sorting algorithm that divides the input list into two parts:
		// a sorted sublist of items which is built up from left to right at the front (left) of the list
		// and a sublist of the remaining unsorted items that occupy the rest of the list.
		
		// The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element
		// from the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order),
		// and moving the sublist boundaries one element to the right.
		
		// Example: int[] nums = {64, 25, 12, 22, 11};
		// After first pass: {11, 25, 12, 22, 64}	
		// After second pass: {11, 12, 25, 22, 64}
		// After third pass: {11, 12, 22, 25, 64}
		// After fourth pass: {11, 12, 22, 25, 64}
		// Sorted array: {11, 12, 22, 25, 64}
		
		int[] nums = {64, 25, 12, 22, 11};
		selectionSort(nums);
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}
	
	private static void selectionSort(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		for(int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for(int j = i + 1; j < n; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the first element
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}
		
	}

}
