package com.DataStructure.BinarySearchTree;

public class InorderSuccessor {

	public static void main(String[] args) {
		FindInorderSuccessor tree = new FindInorderSuccessor();
		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);
		
		tree.inorderSuccessor(22);
		

	}

}

class FindInorderSuccessor extends BinarySearchTree{

	public void inorderSuccessor(int i) {
		Node parent = null;
		inorderSuccessor(i, root, parent);
	}

	private void inorderSuccessor(int key, Node root, Node parent) {
		if(root == null) {
			return;
		}
		
		if(root.data == key) {
			if(root.right != null) {
				root = root.right;
				while(root.left != null) {
					root = root.left;
				}
				System.out.println(root.data);
			}
				
			else if(root.left == null && parent != null) {
				System.out.println(parent.data);
			}
			else {
				System.out.print("No Inorder Successor");
				
			}
		}
		
		if(root.data > key) {
			parent = root;
			inorderSuccessor(key, root.left, parent);
		}
		
		if(root.data < key) {
			inorderSuccessor(key, root.right, parent);
		}
		
		
		
	}
	
}