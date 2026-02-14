package com.prepare.BinaryTrees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BinarySearchTree bst = new BinarySearchTree();
//		int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//		
//		//bst.populateTree(nums);
//		bst.populateSortedTree(nums);
//		
//		//how to print populated Sorted tree
//		bst.display();
		
		AVLTree avl = new AVLTree();
		int[] nums = { 15, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
		
		avl.populateTree(nums);
		avl.display();

	}

}
