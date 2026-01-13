package com.prepare.easyProblems;

public class TwoSumProblem {

	public static int[] twoSum(int[] nums, int target) {
		for (int i=0;i<nums.length;i++) {
			for (int j = i + 1;j<nums.length;j++) {
				if (nums[i] + nums[j] ==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		//Given an array of integers and a target value, determine if there are two distinct numbers in the array that add up to the target.
		//Return their indices (or the numbers themselves, depending on the variation).
		//Input: nums = [2, 7, 11, 15], target = 9
		//Output: [0, 1]
		
		int[] nums = {2,7,11,15};
		int target = 22;
		
		int[] result = twoSum(nums, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);

	}
	
	

}
