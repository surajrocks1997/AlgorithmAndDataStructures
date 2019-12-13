package com.DataStructure.BinarySearchTree;

public class Runner {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		System.out.print("Inorder: ");
		tree.inorder();
		
		tree.deleteKey(20);
		
		tree.deleteKey(30);
		
		tree.deleteKey(50);
		
		System.out.println();
		System.out.print("Inorder: ");
		tree.inorder();
		
		//wrong code
	}

}
