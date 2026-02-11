package com.prepare.easyProblems;

public class InsertionSort {

	public static void main(String[] args) {
		// What is Insertion Sort?
		// Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
		// It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
		
		int[] nums = {12, 11, 13, 5, 6};
		insertionSort(nums);
		
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}
	
	private static void insertionSort(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		for(int i = 1; i < n; i++) {
			int key = nums[i];
			int j = i - 1;
			
			// Move elements of nums[0..i-1], that are greater than key,
			// to one position ahead of their current position
			while(j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = key;
		}
		
	}

}
