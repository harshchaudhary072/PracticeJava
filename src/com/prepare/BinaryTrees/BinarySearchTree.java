package com.prepare.BinaryTrees;

// A binary search tree (BST) is a binary tree in which each node has a value, and the value of each node is greater than the values of all nodes in its left subtree and less than the values of all nodes in its right subtree. This property allows for efficient searching, insertion, and deletion operations.
// The main operations on a binary search tree include:
// 1. Insertion: Adding a new node to the tree while maintaining the BST property.
// 2. Deletion: Removing a node from the tree while maintaining the BST property.
// 3. Searching: Finding a node with a specific value in the tree.
// Let's implement a simple binary search tree in Java which should insert nodes, display the binary tree in order, and search for a value in the tree.

public class BinarySearchTree{
	
	public class Node{
		private int value;
		private Node left;
		private Node right;
		private int height;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	
	private Node root;
	
	public BinarySearchTree() {
//		this.root = null;
	}
	
	public int height(Node node) {
		if (node == null) {
			return -1; // Height of an empty tree is -1
		}
		return node.height;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	private Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}
		
		if (value < node.value) {
			node.left = insert(node.left, value);
		} else if (value > node.value) {
			node.right = insert(node.right, value);
		}
		
		node.height = 1 + Math.max(height(node.left), height(node.right));
		
		return node;
	}
	
	public void populateTree(int[] values) {
		for (int value : values) {
			insert(value);
		}
	}
	
	public void populateSortedTree(int[] values) {
		populateSortedTree(values, 0, values.length - 1);
	}
	
	private void populateSortedTree(int[] values, int start, int end) {
		if (start > end) {
			return;
		}
		
		int mid = start + (end - start) / 2;
		insert(values[mid]);
		
		populateSortedTree(values, start, mid - 1);
		populateSortedTree(values, mid + 1, end);
	}
	
	public boolean balanced() {
		return balanced(root);
	}
	
	private boolean balanced(Node node) {
		if (node == null) {
			return true;
		}
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		return balanced(node.left) && balanced(node.right);
	}
	
	public void display() {
		display(this.root, "Root node: ");
	}
	
	private void display(Node node, String prefix) {
		if (node != null) {
			System.out.println(prefix + node.value);
		    display(node.left, "Left child of " + node.value + " : ");
		    display(node.right, "Right child of " + node.value + " : ");
		}
	}
	
	
	
	
	
}