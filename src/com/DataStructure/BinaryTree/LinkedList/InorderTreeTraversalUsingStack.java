package com.DataStructure.BinaryTree.LinkedList;

import java.util.Stack;

public class InorderTreeTraversalUsingStack {

	public static void main(String[] args) {
		StackInorderTraversal cal = new StackInorderTraversal();
		cal.root = new Node(1);
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		
		System.out.print("Inorder: ");
		cal.printInorderWithoutRecursion();
	}

}

class StackInorderTraversal extends BinaryTree{
	Node root;
	
	public void printInorderWithoutRecursion() {
		Inorder(root);
	}

	public void Inorder(Node node) {
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