package com.DataStructure.BinarySearchTree;

public class FixSwappedNodesOfBST {

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(10); 
		root.right = new Node(2); 
		root.left.left = new Node(1); 
		root.left.right = new Node(3); 
		root.right.right = new Node(12); 
		root.right.left = new Node(7);
		
		System.out.print("Inorder Traversal : ");
			
		CorrectBST correct = new CorrectBST();
		correct.inorder(root);
		System.out.println();
		
		correct.verifyAndCorrect(root);
		System.out.print("Correct Inorder : ");
		correct.inorder(root);

	}
}

class CorrectBST extends BinarySearchTree{
	
	Node first, middle, last, prev;
	
	public void verifyAndCorrectUtil(Node root) {
		if(root != null) {
			verifyAndCorrectUtil(root.left);
			
			if(prev != null && root.data < prev.data) {
				if(first == null) {
					first = prev;
					middle = root;
				}
				else {
					last = root;
				}
			}
			
			prev = root;
			verifyAndCorrectUtil(root.right);
		}
	}
	
	public void verifyAndCorrect(Node root) {
		first = last = middle = prev = null;
		
		verifyAndCorrectUtil(root);
		
		if(first != null && last != null) {
			int temp = first.data;
			first.data = last.data;
			last.data = temp;
		}
		else if(first != null && middle != null) {
			int temp = first.data;
			first.data = middle.data;
			middle.data = temp;
		}
	}
	
	
}
