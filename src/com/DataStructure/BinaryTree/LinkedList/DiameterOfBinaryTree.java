package com.DataStructure.BinaryTree.LinkedList;

class DiameterOfBinaryTree{
	public static void main(String[] args) {
		CalDiam cal = new CalDiam();
		cal.root = new Node(1);
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		System.out.println("Diameter: " + cal.diameter());
	}
}

class CalDiam extends BinaryTree{

	Node root;
	
	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {
		if(node == null) {
			return 0;
		}
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		int ldiameter = diameter(node.left);
		int rdiameter = diameter(node.right);
		
		return Math.max(1 + lheight + rheight, Math.max(ldiameter, rdiameter));
	}

	private int height(Node node) {
		if(node == null) {
			return 0;
		}
		return (1 + Math.max(height(node.left), height(node.right)));
	}
	
}