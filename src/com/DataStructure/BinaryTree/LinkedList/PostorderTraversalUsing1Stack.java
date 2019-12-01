package com.DataStructure.BinaryTree.LinkedList;

import java.util.Stack;

public class PostorderTraversalUsing1Stack {

	public static void main(String[] args) {
		Stack1PostorderTraversal cal = new Stack1PostorderTraversal();
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
class Stack1PostorderTraversal extends BinaryTree{
	Node root;

	public void postOrder() {
		
		if(root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		Node current = root;
		while(true) {
			while(current != null) {
				stack.push(current);
				stack.push(current);
				current = current.left;
			}
			if(stack.isEmpty()) {
				return;
			}
			current = stack.pop();
			
			if(!stack.isEmpty() && stack.peek() == current) {
				current = current.right;
			}
			else {
				System.out.print(current.data + " ");
				current = null;
			}
		}
	}
	
}