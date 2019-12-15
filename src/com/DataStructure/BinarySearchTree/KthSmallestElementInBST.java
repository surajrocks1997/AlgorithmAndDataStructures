package com.DataStructure.BinarySearchTree;

public class KthSmallestElementInBST {

	public static void main(String[] args) {
		kthSmallElement tree = new kthSmallElement();
		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);
		
		tree.ksmallestElement(5);
	}

}

class kthSmallElement extends BinarySearchTree{

	int count = 0;
	public void ksmallestElement(int i) {
		ksmallestElement(i, root);
		
	}

	private void ksmallestElement(int i, Node root) {
		
		if(root==null) {
			return;
		}
		ksmallestElement(i, root.left);
		count++;
		if(count == i) {
			System.out.println(root.data);
		}
		ksmallestElement(i, root.right);
		
		
		
	}
	
}
