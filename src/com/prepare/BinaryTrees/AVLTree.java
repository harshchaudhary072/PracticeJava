package com.prepare.BinaryTrees;

import com.prepare.BinaryTrees.BinarySearchTree.Node;

public class AVLTree {
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
	
	public AVLTree() {
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
		
		return rotate(node);
	}
	
	public Node rotate(Node node) {
		int balance = height(node.left) - height(node.right);
		
		if (balance > 1) {
			if (height(node.left.left) >= height(node.left.right)) {
				return rightRotate(node);
			} else {
				node.left = leftRotate(node.left);
				return rightRotate(node);
			}
		}
		
		if (balance < -1) {
			if (height(node.right.right) >= height(node.right.left)) {
				return leftRotate(node);
			} else {
				node.right = rightRotate(node.right);
				return leftRotate(node);
			}
		}
		
		return node;
	}
	
	private Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;
		
		x.right = y;
		y.left = T2;
		
		y.height = 1 + Math.max(height(y.left), height(y.right));
		x.height = 1 + Math.max(height(x.left), height(x.right));
		
		return x;
	}
	
	private Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;
		
		y.left = x;
		x.right = T2;
		
		x.height = 1 + Math.max(height(x.left), height(x.right));
		y.height = 1 + Math.max(height(y.left), height(y.right));
		
		return y;
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
