package com.DataStructure.BinarySearchTree;

public class SortedArrayToBalancedBST {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		int[] arr = {
				1, 2, 3, 4, 5, 6, 7
		};
		int n = arr.length;

		Node root = list.sortedArraytoBST(arr, 0, n-1);

		list.inorder(root);
	}

}

class ArrayList{

	Node root;

	Node sortedArraytoBST(int arr[], int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start + end)/2;

		Node node = new Node(arr[mid]); 

		node.left = sortedArraytoBST(arr, start, mid-1);

		node.right = sortedArraytoBST(arr, mid + 1, end);

		return node;
	}

	public void inorder(Node root) {
		if(root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

}