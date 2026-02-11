package com.prepare.recursion;

public class MergeSortUsingRecursion {

	public static void main(String[] args) {
		// What is Merge Sort?
		// Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves,
		// calls itself for the two halves, and then merges the two sorted halves.
		// The merge() function is used for merging two halves.
		// The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted
		// and merges the two sorted sub-arrays into one.
		// Example: int[] nums = {38, 27, 43, 3, 9, 82, 10};
		// After sorting: {3, 9, 10, 27, 38, 43, 82}
		// Time Complexity: O(n log n)
		// Space Complexity: O(n)
		// Stable Sort
		// Not In-Place
		// Recursive
		
		int[] nums = {38, 27, 43, 3, 9, 82, 10};
		mergeSort(nums, 0, nums.length - 1);
		System.out.println("Sorted array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	
	public static void mergeSort(int[] nums, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;
			
			// Sort first and second halves
			mergeSort(nums, left, mid);
			mergeSort(nums, mid + 1, right);
			
			// Merge the sorted halves
			merge(nums, left, mid, right);
		}
	}
	
	public static void merge(int[] nums, int left, int mid, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		// Create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		// Copy data to temp arrays
		for (int i = 0; i < n1; i++) {
			L[i] = nums[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = nums[mid + 1 + j];
		}
		
		// Merge the temp arrays
		
		// Initial indexes of first and second subarrays
		int i = 0, j = 0;
		
		// Initial index of merged subarray
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				nums[k] = L[i];
				i++;
			} else {
				nums[k] = R[j];
				j++;
			}
			k++;
		}
		
		// Copy remaining elements of L[] if any
		while (i < n1) {
			nums[k] = L[i];
			i++;
			k++;
		}
		
		// Copy remaining elements of R[] if any
		while (j < n2) {
			nums[k] = R[j];
			j++;
			k++;
		}
	}

}
