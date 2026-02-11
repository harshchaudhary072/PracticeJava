package com.prepare.easyProblems;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//What is Order Agnostic Binary Search?
		//Order Agnostic Binary Search is a variation of the traditional binary search algorithm that can be applied to both ascending and descending sorted arrays without prior knowledge of the order.
		
		int[] nums = {56,23,18,16,14,9,5,3,2};
		int target = 1;
		
		int result = orderAgnosticBinarySearch(nums, target);
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}

	}

	private static int orderAgnosticBinarySearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
		boolean isAscending = nums[start] < nums[end];
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				return mid;
			}
			
			if(isAscending) {
				if(nums[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if(nums[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

}
