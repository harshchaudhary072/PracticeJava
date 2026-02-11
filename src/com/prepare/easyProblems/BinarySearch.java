package com.prepare.easyProblems;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target = 5;
		int result = binarySearch(nums, target);
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}

	}

	private static int binarySearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
		int mid = start + (end - start) / 2;
		
		while(start <= end) {
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return -1;
	}

}
