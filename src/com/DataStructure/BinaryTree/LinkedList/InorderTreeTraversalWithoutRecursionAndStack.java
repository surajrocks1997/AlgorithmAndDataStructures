package com.DataStructure.BinaryTree.LinkedList;

public class InorderTreeTraversalWithoutRecursionAndStack {

	public static void main(String[] args) {
		InorderWithoutRecursionAndStack tree = new InorderWithoutRecursionAndStack();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.print("Inorder: ");
		tree.Inorder();

	}

}

class InorderWithoutRecursionAndStack extends BinaryTree{

	Node root;
	Node prev, current;
	
	public void Inorder() {
		if(root == null) {
			return;
		}
		current = root;
		while(current != null) {
			if(current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;
			}
			else {
				prev = current.left;
				 while(prev.right != null && prev.right != current) {
					 prev = prev.right;
				 }
				 
				 if(prev.right == null) {
					 prev.right = current;
					 current = current.left;
				 }
				 else {
					 prev.right = null;
					 System.out.print(current.data + " ");
					 current = current.right;
				 }
			}
		}
	}
	
}