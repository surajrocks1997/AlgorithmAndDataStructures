package com.DataStructure.BinaryTree;

public class DiameterOfBinaryTree1 {

	public static void main(String[] args) {
		CalDiam1 cal = new CalDiam1();
		cal.root = new Node(1);
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		
		System.out.println("Diameter: " + cal.Diameter());

	}

}

class CalDiam1 extends BinaryTree{

	public int Diameter() {
		return diam(root);
	}

	private int diam(Node root) {
		if(root == null) {
			return 0;
		}
		Minimum min = new Minimum();
		
		@SuppressWarnings("unused")
		int treeheight = height(root, min);
		//System.out.println("Tree height: " + treeheight);
		
		return min.minVal;
	}

	private int height(Node node, Minimum min) {
		if(node == null) {
			return 0;
		}
		int lheight = height(node.left, min);
		int rheight = height(node.right, min);
		min.minVal = Math.max(min.minVal, 1 + lheight + rheight);
		
		
		return 1 + Math.max(lheight, rheight);
	}
	
}

class Minimum{
	int minVal = Integer.MIN_VALUE;
}
