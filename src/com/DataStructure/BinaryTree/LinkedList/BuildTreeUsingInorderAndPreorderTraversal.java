package com.DataStructure.BinaryTree.LinkedList;

public class BuildTreeUsingInorderAndPreorderTraversal{

	public static void main(String[] args) {

		BuildTree tree = new BuildTree();
		System.out.print("Inorder: ");
		int[] in = {
				4, 2, 5, 1, 3
		};
		for (int i : in) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Preorder: ");
		int[] pre = {
			1, 2, 4, 5, 3	
		};
		for (int i : pre) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int length = in.length;
		Node root = tree.build(in, pre, 0, length-1);
		System.out.println(root.data + " ");
		
	}
}

class BuildTree extends BinaryTree{

	Node root;
	int preIndex = 0;
	
	public Node build(int[] in, int[] pre, int inStart, int inEnd) {
		if(inStart > inEnd) {
			return null;
		}
		
		Node tNode = new Node(pre[preIndex++]);
		
		if(inStart == inEnd) {
			return tNode;
		}
		
		int inIndex = search(in, inStart, inEnd, tNode.data);
		tNode.left = build(in, pre, inStart, inIndex-1);
		tNode.right = build(in, pre, inIndex+1, inEnd);
		
		return tNode;
	}

	private int search(int[] in, int inStart, int inEnd, int data) {
		int i;
		for(i = inStart; i <= inEnd; i++ ) {
			if(in[i] == data) {
				return i;
			}
		}
		return i;
	}
	
}
