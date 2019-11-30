package com.DataStructure.BinaryTree.Array;

public class Runner {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root("1");
		tree.setLeft("2", 0);
		tree.setRight("3", 0);
		tree.setLeft("4", 1);
		tree.setRight("5", 1);
		tree.setLeft("6", 2);
		tree.setRight("7", 2);
		
		tree.printTree();
		
		

	}

}
