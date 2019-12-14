package com.DataStructure.BinaryTree.LinkedList;

/**
 * BinaryTree
 */
public class BinaryTree {

    Node root;

    public BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }
    
    public boolean IsBST() {
    	return IsBST(root);
    }

	private boolean IsBST(Node node) {
		if(node == null) {
			return true;
		}
		if(node.left != null && node.data > node.left.data) {
			IsBST(node.left);
		}
		else {
			return false;
		}
		
		if(node.right != null && node.data < node.right.data) {
			IsBST(node.right);
		}
		else {
			return false;
		}
		return true;
	}
}