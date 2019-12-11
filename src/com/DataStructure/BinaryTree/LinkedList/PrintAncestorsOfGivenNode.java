package com.DataStructure.BinaryTree.LinkedList;

public class PrintAncestorsOfGivenNode {

	public static void main(String[] args) {
		PrintAncestors tree = new PrintAncestors();
		tree.root = new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.right = new Node(8); 
        tree.root.right.right.left = new Node(6); 
        tree.root.right.right.right = new Node(7);
        
        tree.ancesstor(7);

	}

}

class PrintAncestors extends BinaryTree{

	public void ancesstor(int i) {
		ancesstor(root, i);
	}

	private boolean ancesstor(Node node, int i) {
		if(node == null) {
			return false;
		}
		if(node.data == i) {
			return true;
		}
		if(ancesstor(node.left, i) || ancesstor(node.right, i)) {
			System.out.print(node.data + " ");
			return true;
		}
		
		return false;
		
	}
	
}