package com.DataStructure.BinarySearchTree;

/*
 * *************CODE NOT WORKING****************
 */

public class InPlaceConversionSortedDLLToBalancedBST {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		list.printList();
		
		Node1 root = list.sortedListToBST();
		System.out.println();
		
		list.inorder(root);
		
	}
}

class Node1{
	int data;
	Node1 next, prev;
	
	Node1(int data){
		this.data = data;
		next = prev = null;
	}
}

class LinkedList{
	Node1 head;
	
	public Node1 sortedListToBST() {
		int n = countNodes(head);
		
		sortedListToBST(n);
		return head;
		
	}

	public void printList() {
		Node1 node = head;
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print(node.data);
	}

	public void inorder(Node1 root) {
		if(root == null) {
			return;
		}
		inorder(root.prev);
		System.out.print(root.data + " ");
		inorder(root.next);
		
	}

	public void push(int data) {
		Node1 node = new Node1(data);
		node.prev = null;
		node.next = head;
		
		if(head != null) {
			head.prev = node;
		}
		
		head = node;
		
	}

	private Node1 sortedListToBST(int n) {
		if(n <= 0) {
			return null;
		}
		Node1 left = sortedListToBST(n/2);
		
		Node1 root = head;
		
		root.prev = left;
		
		head = head.next;
		
		root.next = sortedListToBST(n - (n/2) - 1);
		return root;
		
		
	}

	private int countNodes(Node1 head) {
		int count = 0;
		Node1 temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
