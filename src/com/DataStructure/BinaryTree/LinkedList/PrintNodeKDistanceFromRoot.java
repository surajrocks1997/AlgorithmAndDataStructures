package com.DataStructure.BinaryTree.LinkedList;

public class PrintNodeKDistanceFromRoot {

	public static void main(String[] args) {
		PrintNodeKDistance tree = new PrintNodeKDistance();
		tree.root = new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.right = new Node(8); 
        tree.root.right.right.left = new Node(6); 
        tree.root.right.right.right = new Node(7);
        
        tree.printNode(3);
	}

}

class PrintNodeKDistance extends BinaryTree{
	Node root;

	public void printNode(int k) {
		printNode(root, k);
		
	}

	public void printNode(Node node, int k) {
		if(node == null) {
			return;
		}
		if(k==0) {
			System.out.println(node.data + " ");
			return;
		}
		else {
			printNode(node.left, k-1);
			printNode(node.right, k-1);
		}
		
		
	}
}
