package com.DataStructure.BinarySearchTree;

import java.util.LinkedList;

public class PrintSortedElementOfTwoBST {

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		BinarySearchTree tree2 = new BinarySearchTree();

		tree1.insert(8);
		tree1.insert(2);
		tree1.insert(10);
		tree1.insert(1);

		tree2.insert(5);
		tree2.insert(3);
		tree2.insert(0);

		printSortedElements(tree1.root, tree2.root);
	}

	private static void printSortedElements(Node root1, Node root2) {
		LinkedList<Node> list1 = new LinkedList<Node>();
		LinkedList<Node> list2 = new LinkedList<Node>();
		list1 = storeInorder(root1, list1);
		for (Node node : list1) {
			System.out.print(node.data + " ");
		}

		System.out.println();
		list2 = storeInorder(root2, list2);
		for (Node node : list2) {
			System.out.print(node.data + " ");
		}
		
		System.out.println();
		
		while(!list1.isEmpty() && !list2.isEmpty()) {
			Node x = list1.getFirst();
			Node y = list2.getFirst();
			if(x.data < y.data) {
				System.out.print(x.data + " ");
				list1.removeFirst();
			}
			else {
				System.out.print(y.data + " ");
				list2.removeFirst();
			}
		}
		while(list1.isEmpty() || list2.isEmpty()) {
			if(list1.isEmpty()) {
				for (Node node : list2) {
					System.out.print(node.data + " ");
				}
				break;
			}
			else if(list2.isEmpty()){
				for (Node node : list1) {
					System.out.print(node.data + " ");
				}
				break;
			}
		}
		


	}

	private static LinkedList<Node> storeInorder(Node root, LinkedList<Node> list) {
		if(root == null) {
			return list;
		}
		storeInorder(root.left, list);

		list.add(root);
		
		storeInorder(root.right, list);

		return list;
	}

}
