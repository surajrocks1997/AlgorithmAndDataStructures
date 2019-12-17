package com.DataStructure.BinarySearchTree;

import java.util.Stack;

public class FloorAndCeilFromBST {

	public static void main(String[] args) {
		FloorAndCeil tree = new FloorAndCeil();
		tree.insert(8);
		tree.insert(4);
		tree.insert(12);
		tree.insert(2);
		tree.insert(6);
		tree.insert(10);
		tree.insert(14);
		
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " -> ");
			int x = tree.FloorCeil(tree.root, i);
			if(x!=0) {
				System.out.println(x);
			}
			else {
				System.out.println("-1");
			}
		}

	}

}

class FloorAndCeil extends BinarySearchTree{

	public int FloorCeil(Node root, int i) {
		if(root == null) {
			return 0;
		}
		
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		
		while(current != null || stack.size() > 0) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			if(current.data >= i) {
				return current.data;
			}
			current = current.right;
		}
		return 0;
		
	}

	
	
}
