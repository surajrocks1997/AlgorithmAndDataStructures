package com.DataStructure.BinaryTree;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		CalDiam cal = new CalDiam();
		cal.root = new Node(1);    
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		
		System.out.println("Diameter: " + cal.calDiameter());
		
	}

}

class CalDiam extends BinaryTree{

	Node root;
	
	int calDiameter() {
		return diameter(root);
	}

	private int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);
		
		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	}

	private int height(Node node) {
		if(node == null) {
			return 0; 
		}
		return (1 + Math.max(height(node.left), height(node.right)));
	}

	
	
}
