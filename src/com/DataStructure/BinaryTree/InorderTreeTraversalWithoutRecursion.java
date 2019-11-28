package com.DataStructure.BinaryTree;

import java.util.Stack;

public class InorderTreeTraversalWithoutRecursion {

	public static void main(String[] args) {
		InorderWithoutRecursion cal = new InorderWithoutRecursion();
		cal.root = new Node(1);
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		
		System.out.print("Inorder: ");
		cal.printInorderWithoutRecursion();
	}

}

class InorderWithoutRecursion extends BinaryTree{
	Node root;
	
	public void printInorderWithoutRecursion() {
		Inorder(root);
	}

	private void Inorder(Node node) {
		if(root == null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		Node current = root;
		
		while(current != null || stack.size() > 0) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
		
		
	}
}