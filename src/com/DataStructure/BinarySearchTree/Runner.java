package com.DataStructure.BinarySearchTree;

public class Runner {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(87);
		tree.insert(48);
		tree.insert(2);
		tree.insert(1);
		tree.insert(29);
		tree.insert(49);
		tree.insert(94);
		tree.insert(55);
		
		System.out.print("Inorder: ");
		tree.inorder();
		

	}

}
