package com.DataStructure.BinaryTree.LinkedList;

public class MaxDepthOfTree {

	public static void main(String[] args) {
		MaxDepth Depth = new MaxDepth();
		Depth.root = new Node(1);
		Depth.root.left = new Node(2);
		Depth.root.right = new Node(3);
		Depth.root.left.left = new Node(4);
		Depth.root.left.right = new Node(5);
		
		System.out.print("Max Depth: ");
		int depth = Depth.maxDepth();
		System.out.println(depth);

	}

}

class MaxDepth extends BinaryTree{

	Node root;
	public int maxDepth() {
		return maxDepth(root);
	}
	public int maxDepth(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		int ldepth = maxDepth(node.left);
		int rdepth = maxDepth(node.right);
		
		if(ldepth >= rdepth) {
			return ldepth+1;
		}
		else {
			return rdepth+1;
		}
	}	
}