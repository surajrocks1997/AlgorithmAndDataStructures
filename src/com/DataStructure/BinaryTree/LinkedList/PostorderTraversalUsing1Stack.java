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
        cal.postorder();
        
        }
}
class Stack1PostorderTraversal extends BinaryTree{
	Node root;

	public void postorder() {
		if(root == null){
			return;
		}
		
		Node current = root;
		
		Stack<Node> stack = new Stack<>();
		while(stack.size()>0 || current != null) {
			while(current != null) {
				if(current.right != null) {
					stack.push(current.right);
				}
				stack.push(current);
				current = current.left;
			}
			while(stack.size() > 0 && current == null) {
				current = stack.pop();
				if(stack.isEmpty()) {
					System.out.print(current.data);
					current = null;
				}
				else if(current.right != null && current.right == stack.peek()) {
					Node right = stack.pop();
					stack.push(current);
					current = right;
				}
				else {
					System.out.print(current.data + " ");
					current = null;
				}
			}
		}
		
		
		
	}
	
}