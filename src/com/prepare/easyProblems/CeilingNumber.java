package com.prepare.easyProblems;

public class CeilingNumber {

	public static void main(String[] args) {
		
		//What is Ceiling Number?
		//The ceiling of a target number in a sorted array is the smallest element in the array that is greater than or equal to the target.
		
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,9,14,16,18,23,56};
		int target = 15;
		
		int result = ceilingNumber(nums, target);
		System.out.println("Ceiling number is at index: " + result);

	}

	private static int ceilingNumber(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
//		int mid = start + (end - start) / 2;
		
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
		
		return start;
	}

}
