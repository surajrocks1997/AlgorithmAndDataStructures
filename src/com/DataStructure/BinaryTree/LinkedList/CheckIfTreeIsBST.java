package com.DataStructure.BinaryTree.LinkedList;

public class CheckIfTreeIsBST {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(4); 
		tree.root.left = new Node(2);
		tree.root.right = new Node(5); 
		tree.root.left.left = new Node(1); 
		tree.root.left.right = new Node(3); 
		
		if(tree.IsBST()) {
			System.out.println("It is BST");
		}
		else {
			System.out.println("It is not BST");
		}

	}

}
