package com.DataStructure.BinaryTree.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Using Level Order Traversal with queue to find max width of a binary tree
 */
public class MaxWidthBinaryTree {

	public static void main(String[] args) {
		MaxWidthUsingQueue tree = new MaxWidthUsingQueue();
		tree.root = new Node(1); 
		tree.root.left = new Node(2);
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.right = new Node(8); 
		tree.root.right.right.left = new Node(6); 
		tree.root.right.right.right = new Node(7); 
	        
	     System.out.println("Max Width: " + tree.MaxWidth(tree.root));

	}

}

class MaxWidthUsingQueue extends BinaryTree{
	Node root;
	
	public int MaxWidth(Node root) {
		if(root == null) {
			return 0;
		}
		int maxWidth = 0;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int count = queue.size();
			maxWidth = Math.max(maxWidth, count);
			
			while(count-- > 0) {
				Node temp = queue.remove();
				
				if(temp.left != null) {
					queue.add(temp.left);
				}
				
				if(temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
		
		return maxWidth;
	}
	
}
