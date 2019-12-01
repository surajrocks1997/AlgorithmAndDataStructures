package com.DataStructure.BinaryTree.LinkedList;

import java.util.Stack;

public class PostorderTraversalUsingStack {

	public static void main(String[] args) {
		StackPostorderTraversal cal = new StackPostorderTraversal();
		cal.root = new Node(1);
		cal.root.left = new Node(2);
		cal.root.right = new Node(3);
		cal.root.left.left = new Node(4);
		cal.root.left.right = new Node(5);
		cal.root.right.left = new Node(6); 
        cal.root.right.right = new Node(7); 
		
		System.out.print("Postorder: ");
		cal.postOrder();
	}

}

class StackPostorderTraversal extends BinaryTree{

	Node root;
	public void postOrder() {
		if(root == null) {
			return;
		}
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		Node current = root;
		stack1.push(current);
		while(!stack1.isEmpty()) {
			current = stack1.peek();
			stack2.push(stack1.pop());
			if(current.left != null) {
				stack1.push(current.left);
			}
			if(current.right != null) {
				stack1.push(current.right);
			}
		}
		while(!stack2.isEmpty()) {
			Node print = stack2.pop();
			System.out.print(print.data + " ");
		}
	}
	
}
