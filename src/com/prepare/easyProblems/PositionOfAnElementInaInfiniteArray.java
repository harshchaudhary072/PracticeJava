package com.prepare.easyProblems;

public class PositionOfAnElementInaInfiniteArray {

	public static void main(String[] args) {
		// What is Position of an element in an infinite array?
		// Given an infinite sorted array (or an array with unknown size), find the position of a given target element.
		
		int[] nums = {3,5,7,9,10,13,15,18,20,25,30,35,40,45,50};
		int target = 18;
		int result = findPosition(nums, target);
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}

	}
	
	private static int findPosition(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 1;
		
		// Find the range where the target may be present
		while(target > nums[end]) {
			int newStart = end + 1;
			// double the box size
			end = end + (end - start + 1) * 2;
			start = newStart;
		}
		
		// Now perform binary search in the found range
		return binarySearch(nums, target, start, end);
	}
	
	private static int binarySearch(int[] nums, int target, int start, int end) {
		// TODO Auto-generated method stub
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
