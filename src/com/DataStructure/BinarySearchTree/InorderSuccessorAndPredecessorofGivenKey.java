package com.DataStructure.BinarySearchTree;

public class InorderSuccessorAndPredecessorofGivenKey {

	public static void main(String[] args) {
		InorderSuccessorAndPredecessor tree = new InorderSuccessorAndPredecessor();
		int key = 65;
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.InorderPredAndSuc(key);
	}

}

class InorderSuccessorAndPredecessor extends BinarySearchTree{
	
	public void InorderPredAndSuc(int key) {
		Node predecessor = null;
		Node successor = null;
		Node temp = root;
		InorderPredAndSuc(temp, predecessor, successor, key);
		
	}

	public void InorderPredAndSuc(Node root, Node predecessor, Node successor, int key) {
		if(root == null) {
			return;
		}
		
		if(root.data == key) {
			if(root.left != null) {
				Node temp = root.left;
				while(temp.right != null) {
					temp = temp.right;
				}
				predecessor = temp;
			}
			
			if(root.right != null) {
				Node temp = root.right;
				while(temp.left != null) {
					temp = temp.left;
				}
				successor = temp;
			}
			
			if(successor != null) {
				System.out.println("Successor: " + successor.data);
			}
			else {
				System.out.println("No Successor");
			}
			if(predecessor != null) {
				System.out.println("Predecessor: " + predecessor.data);
			}
			else {
				System.out.println("No Predecessor");
			}
		}
		
		else if(root.data > key) {
			successor = root;
			InorderPredAndSuc(root.left, predecessor, successor, key);

		}
		
		else if(root.data < key) {
			predecessor = root;
			InorderPredAndSuc(root.right, predecessor, successor, key);

		}
	}
	
}
