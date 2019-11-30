package com.DataStructure.BinaryTree.LinkedList;
/*
 * Still Incomplete
 */
public class SingleThreadedInorder {

	public static void main(String[] args) {
		SingleThreadedInorderImplementation tree = new SingleThreadedInorderImplementation();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.print("Inorder: ");
		tree.Inorder();
	}

}

class SingleThreadedInorderImplementation extends SingleThreadedBinaryTree{

	Node root;
	
	public void Inorder() {
	
		Node current = leftmost(root);
		while(current != null) {
			System.out.print(current.data + " ");
			
			
		}
		
	}

	private Node leftmost(Node node) {
		if(node == null) {
			return null;
		}
		
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	
}
