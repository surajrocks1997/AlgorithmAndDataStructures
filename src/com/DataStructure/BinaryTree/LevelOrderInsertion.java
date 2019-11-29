package com.DataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;




public class LevelOrderInsertion {

	public static void main(String[] args) {
		InsertElementLevelOrder tree = new InsertElementLevelOrder();
		tree.root = new Node(10);    
		tree.root.left = new Node(11);
		tree.root.right = new Node(9);
        tree.root.left.left = new Node(7);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(8);
      
        System.out.print("Before: ");
        tree.printInorder();
        System.out.println();
        
        tree.insert(12);
        
        System.out.print("After: ");
        tree.printInorder();
        
	}
}

class InsertElementLevelOrder extends BinaryTree {

	Node root;
	
	public void printInorder() {
		Inorder(root);
	}
	private void Inorder(Node node) {
		if (node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
		
	}
	
	public void insert(int data) {
		Node temp = root;
		insert(data, temp);
	}
	public void insert(int data, Node temp) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);
		
		while(!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();
			
			if(temp.left == null) {
				temp.left = new Node(data);
				break;
			}
			else {
				queue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(data);
				break;
			}
			else {
				queue.add(temp.right);
			}
		}
		
	}
		
}
