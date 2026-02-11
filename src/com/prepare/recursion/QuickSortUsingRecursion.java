package com.prepare.recursion;

public class QuickSortUsingRecursion {
	
	public static void main(String[] args) {
		
		//What is Quick sort
		
		
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


	// Main quicksort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);   // Left side
            quickSort(arr, pi + 1, high);  // Right side
        }
    }

    // Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing last element as pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element <= pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return pivot index
    }


	
	

}
