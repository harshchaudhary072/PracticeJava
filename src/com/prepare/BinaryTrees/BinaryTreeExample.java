package com.prepare.BinaryTrees;


		// What is a binary tree?
		// A binary tree is a data structure in which each node has at most two children, referred to as the left child and the right child.
		// Why use a binary tree?
		// Binary trees are used to implement various data structures such as binary search trees, heaps, and expression trees. They provide efficient searching, insertion, and deletion operations.
		// Basic operations on a binary tree:
		// 1. Insertion: Adding a new node to the tree.
		// 2. Deletion: Removing a node from the tree.
		// 3. Traversal: Visiting all the nodes in a specific order (e.g., in-order, pre-order, post-order).
		// Example of a binary tree:
		//         1	
		//        / \	
		//       2   3
		//      / \			
		//     4   5
		// In this example, the root node is 1, which has two children (2 and 3). Node 2 has two children (4 and 5), while node 3 has no children.
		//Let's implement a simple binary tree in Java which should insert nodes, display binary tree in order, and search for a value in the tree.


		
class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
	
}

public class BinaryTreeExample {
	Node root;

	BinaryTreeExample() {
		root = null;
	}

	void insert(int data) {
		root = insertRec(root, data);
	}

	Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}
	
	 void printTree() {
	        printTreeRec(root, 0);
	    }

	    void printTreeRec(Node root, int space) {
	        int COUNT = 5;
	        if (root == null)
	            return;

	        space += COUNT;

	        printTreeRec(root.right, space);

	        System.out.println();
	        for (int i = COUNT; i < space; i++)
	            System.out.print(" ");
	        System.out.println(root.data);

	        printTreeRec(root.left, space);
	    }


	boolean search(int key) {
		return searchRec(root, key);
	}

	boolean searchRec(Node root, int key) {
		if (root == null)
			return false;
		if (root.data == key)
			return true;
		return key < root.data
				? searchRec(root.left, key)
				: searchRec(root.right, key);
	}

	public static void main(String[] args) {
		BinaryTreeExample tree = new BinaryTreeExample();
		
		tree.insert(40);
		tree.insert(15);
		tree.insert(20);
		tree.insert(70);
		tree.insert(50);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal:");
		tree.inorder();
		tree.printTree();

		int keyToSearch = 40;
		System.out.println("\n\nSearching for " + keyToSearch + ": " + tree.search(keyToSearch));
		
		keyToSearch = 90;
		System.out.println("Searching for " + keyToSearch + ": " + tree.search(keyToSearch));
		
	
}
}
