package com.DataStructure.BinaryTree;

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
	public void Inorder() {
		Node current, prev;
		current = root;
		
		if(root == null) {
			return;
		}
		while(current != null) {
			if(current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;
			}
			else {
				prev = current.left;
				current = current.left;
			}
			
		}
		
	}
	
}