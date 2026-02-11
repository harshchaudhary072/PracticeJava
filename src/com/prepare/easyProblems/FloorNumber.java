package com.prepare.easyProblems;

public class FloorNumber {
	
	//What is Floor Number?
	//The floor of a target number in a sorted array is the greatest element in the array that is less than or equal to the target.
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,9,14,16,18,23,56};
		int target = 15;
		int result = floorNumber(nums, target);
		System.out.println("Floor number is at index: " + result);

	}

	private static int floorNumber(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;
		
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
		
		return end;
	}

}
