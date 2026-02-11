package com.prepare.easyProblems;

public class FirstAndLastPositionInSortedArray {

	public static void main(String[] args) {
		// What is First and Last Position in Sorted Array?
		// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
		
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] result = searchRange(nums, target);
		System.out.println("First and Last Position of target is: [" + result[0] + ", " + result[1] + "]");

	}
	
	private static int[] searchRange(int[] nums, int target) {
		// TODO Auto-generated method stub
		int[] result = {-1, -1};
		result[0] = findFirstPosition(nums, target);
		result[1] = findLastPosition(nums, target);
		return result;
	}
	
	private static int findFirstPosition(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
		int firstPosition = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				firstPosition = mid;
				end = mid - 1; // continue searching in the left half
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return firstPosition;
	}
	
	private static int findLastPosition(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
		int lastPosition = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				lastPosition = mid;
				start = mid + 1; // continue searching in the right half
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return lastPosition;
	}

}
