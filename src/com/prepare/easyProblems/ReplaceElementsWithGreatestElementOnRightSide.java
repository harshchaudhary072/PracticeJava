package com.prepare.easyProblems;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,4,5,3,1,2};
        int[] result = replaceElements(arr);
        System.out.println(java.util.Arrays.toString(result));

	}
	
	public static int[] replaceElements(int[] arr) {
        int maxRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];       // store current value
            arr[i] = maxRight;       // replace with max on right
            maxRight = Math.max(maxRight, temp); // update max
        }
        return arr;
    }    
	

}
