package com.DataStructure.BinaryTree.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel_LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(1); 
		 root.left = new Node(2);
		 root.right = new Node(3); 
	     root.left.left = new Node(4); 
	     root.left.right = new Node(5); 
	     root.right.right = new Node(8); 
	     root.right.right.left = new Node(6); 
	     root.right.right.right = new Node(7); 
	     
	     levelOrder(root);
	}
	
	static class Node{
		int data;
		Node left, right, nextRight;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
			nextRight = null;
		}
	};
	
	public static void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		queue.add(null);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(temp != null) {
				
				temp.nextRight = queue.peek();
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}
			}
			else if(queue.isEmpty()) {
				queue.add(null);
			}
		}
		
	}

}