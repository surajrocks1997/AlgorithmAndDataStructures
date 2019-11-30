package com.DataStructure.BinaryTree.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class DeletingElementBinaryTree {

	public static void main(String[] args) {
		DeleteElementBT tree = new DeleteElementBT();
		tree.root = new Node(10);    
		tree.root.left = new Node(11);
		tree.root.right = new Node(9);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(8);
        
        Print print = new Print();
        System.out.print("Inorder Before Deletion: ");
        print.Inorder(tree.root);
        System.out.println();
        
        tree.delete(9);
        
        System.out.print("Inorder After Deletion: ");
        print.Inorder(tree.root);
        System.out.println();
	}

}

class DeleteElementBT extends BinaryTree{
	Node root;
	public void delete(int data) {
		Node current = root;
		if(current == null) {
			return;
		}
		
		if(current.left == null && current.right == null) {
			if(current.data == data) {
				return;
			}
			else 
				System.out.println(current);
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(current);
		
		Node tempNode = null;
		Node dataNode = null;
		
		while(!queue.isEmpty()) {
			tempNode = queue.poll();
			
			if(tempNode.data == data) {
				dataNode = tempNode;
				break;
			}
			
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
		
		if(dataNode != null) {
			int x = tempNode.data;
			deleteRightMost(root, tempNode);
			System.out.println("Deleted Data: " + x);
		}	
		
	}
	private void deleteRightMost(Node root, Node tempNode) {
		Node rightMost = root;
		Node prevRightMost = null;
		
		while(rightMost.right != null) {
			if(rightMost.right != null) {
				prevRightMost = rightMost;
				rightMost = rightMost.right;
			}
		}
		prevRightMost.right = null;
		tempNode.data = rightMost.data;
	}
}