package com.prepare.easyProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 1, 5};
//
//        // Convert array to Set (removes duplicates)
//        Set<Integer> set = new HashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        // Convert back to array
//        int[] uniqueArr = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            uniqueArr[i++] = num;
//        }
//
//        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
        
        int[] uniqueArr = Arrays.stream(arr)
                .distinct()
                .toArray();

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));


	}

}
