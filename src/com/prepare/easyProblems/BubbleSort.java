package com.prepare.easyProblems;

public class BubbleSort {

	public static void main(String[] args) {
		// What is Bubble Sort?
		// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
		// compares adjacent elements and swaps them if they are in the wrong order.
		
		int[] nums = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(nums);
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}

	}

	private static void bubbleSort(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					// swap nums[j] and nums[j+1]
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		
		
	}

}
