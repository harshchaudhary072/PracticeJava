package com.prepare.easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,1,2,2,1,1,3,3};
		int k = 2;
		
		int[] result = topKFrequent(nums, k);
		
		System.out.println(Arrays.toString(result));

		
		
//		Map<Integer, Integer> result = checkCount(nums);
//		
//		//Print the counts
//		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer,Integer> count = new HashMap<>();
		for (int num:nums) {
			count.put(num, count.getOrDefault(num, 0)+1);
		}
		
		List<int[]> arr = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			arr.add(new int[] {entry.getValue(), entry.getKey()});
		}
		
		arr.sort((a,b) -> b[0]-a[0]);
		
		int[] res = new int[k];
		for (int i = 0;i<k;i++) {
			res[i] = arr.get(i)[1];
		}
		
		return res;
		
		
	}
	
	
//	public static Map<Integer, Integer> checkCount(int[] nums) {
//		Map<Integer, Integer> count = new HashMap<>();
//		
//		for (int num:nums) {
//			count.put(num, count.getOrDefault(num, 0)+1);
//		}
//		
//		return count;
//	}

}
