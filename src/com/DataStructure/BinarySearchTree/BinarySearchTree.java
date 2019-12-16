package com.DataStructure.BinarySearchTree;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		super();
		root = null;
	}
	
	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		}
		else if(data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	public void inorder() {
		inorder(root);
	}

	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public void deleteKey(int key) {
		root = delete(root, key);
	}

	private Node delete(Node root, int key) {
		if(root == null) {
			return root;
		}
		if(key < root.data) {
			root.left = delete(root.left, key);
		}
		else if(key > root.data) {
			root.right = delete(root.right, key);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			
			root.data = minVal(root.right);
			
			root.right = delete(root.right, root.data);
		}
		
		return root;
	}

	private int minVal(Node node) {
		int min = node.data;
		while(node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}
	
	public void minValue() {
		minValue(root);
	}

	private void minValue(Node node) {
		if(node == null) {
			return;
		}
		
		while(node.left != null) {
			node = node.left;
		}
		System.out.println("Minimum Value: " + node.data);
		
	}
	
	
}
