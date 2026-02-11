package com.prepare.recursion;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int foundIndex = rotatedBinarySearch(arr, target, 0, arr.length - 1);
		if (foundIndex != -1) {
			System.out.println("Element " + target + " found at index: " + foundIndex);
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}

	}
	
	public static int rotatedBinarySearch(int[] arr, int target, int left, int right) {
		if (left > right) {
			return -1; // Base case: target not found
		}

		int mid = left + (right - left) / 2;

		if (arr[mid] == target) {
			return mid; // Target found
		}

		// Check if the left half is sorted
		if (arr[left] <= arr[mid]) {
			// Target is in the left half
			if (target >= arr[left] && target < arr[mid]) {
				return rotatedBinarySearch(arr, target, left, mid - 1);
			} else { // Target is in the right half
				return rotatedBinarySearch(arr, target, mid + 1, right);
			}
		} else { // Right half is sorted
			// Target is in the right half
			if (target > arr[mid] && target <= arr[right]) {
				return rotatedBinarySearch(arr, target, mid + 1, right);
			} else { // Target is in the left half
				return rotatedBinarySearch(arr, target, left, mid - 1);
			}
		}
	}

}
