package com.DataStructure.BinarySearchTree;

import java.util.Vector;

public class NormalBSTtoBalancedBST {

	public static void main(String[] args) {
		NormalToBalancedBST tree = new NormalToBalancedBST();
		tree.root = new Node(10); 
		tree.root.left = new Node(8); 
		tree.root.left.left = new Node(7); 
		tree.root.left.left.left = new Node(6); 
		tree.root.left.left.left.left = new Node(5);
		
		tree.root = tree.buildTree(tree.root);
		
		System.out.print("Inorder : ");
		tree.inorder(tree.root);

	}
}

class NormalToBalancedBST extends BinarySearchTree{

	public Node buildTree(Node root) {
		Vector<Node> nodes = new Vector<Node>();
		storesBSTNodes(root, nodes);
		
		int n = nodes.size();
		return buildTreeUtil(nodes, 0, n-1);
	}

	private Node buildTreeUtil(Vector<Node> nodes, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start + end)/2;
		Node node = nodes.get(mid);
		
		node.left = buildTreeUtil(nodes, start, mid-1);
		node.right = buildTreeUtil(nodes, mid+1, end);
		
		return node;
	}

	private void storesBSTNodes(Node root, Vector<Node> nodes) {
		if(root == null) {
			return;
		}
		storesBSTNodes(root.left, nodes);
		nodes.add(root);
		storesBSTNodes(root.right, nodes);
		
	}
	
}
