package com.prepare.easyProblems;

public class CycleSort {

	public static void main(String[] args) {
		// What is Cycle Sort?
		// Cycle Sort is an in-place, unstable sorting algorithm that is based on the idea
		// that the array to be sorted can be divided into cycles.
		// It is particularly useful when memory writes are a costly operation.
		// The main idea is to rotate the elements in each cycle to their correct positions.
		
		int[] nums = {3, 1, 5, 2, 4};
		cycleSort(nums);
		System.out.println("Sorted array: ");
			
		for(int num : nums) {
			System.out.print(num + " ");
		}
		

	}
	
	private static void cycleSort(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		
		for(int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
			int item = nums[cycleStart];
			
			// Find position where we put the element
			int pos = cycleStart;
			for(int i = cycleStart + 1; i < n; i++) {
				if(nums[i] < item) {
					pos++;
				}
			}
			
			// If the element is already in the correct position
			if(pos == cycleStart) {
				continue;
			}
			
			// Skip duplicates
			while(item == nums[pos]) {
				pos++;
			}
			
			// Put the item to its correct position
			if(pos != cycleStart) {
				int temp = item;
				item = nums[pos];
				nums[pos] = temp;
			}
			
			// Rotate the rest of the cycle
			while(pos != cycleStart) {
				pos = cycleStart;
				
				// Find position where we put the element
				for(int i = cycleStart + 1; i < n; i++) {
					if(nums[i] < item) {
						pos++;
					}
				}
				
				// Skip duplicates
				while(item == nums[pos]) {
					pos++;
				}
				
				// Put the item to its correct position
				if(item != nums[pos]) {
					int temp = item;
					item = nums[pos];
					nums[pos] = temp;
				}
			}
		}
		
	}

}
