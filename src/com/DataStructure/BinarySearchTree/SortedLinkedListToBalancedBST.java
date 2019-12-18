package com.DataStructure.BinarySearchTree;

import com.DataStructure.BinarySearchTree.LinkedList.TreeNode;

public class SortedLinkedListToBalancedBST {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
		
		list.printList();
		
		TreeNode root = list.sortedListToBST();
		System.out.println();
		System.out.print("Inorder : ");
		list.Inorder(root);
		

	}

}

class LinkedList{
	class ListNode{
		int data;
		ListNode next, prev;
		
		ListNode(int data){
			this.data = data;
			next = prev = null;
		}
	}
	
	class TreeNode{
		int data;
		TreeNode left, right;
		
		TreeNode(int data){
			this.data = data;
			left = right = null;
		}
	}

	ListNode head;
	
	TreeNode sortedListToBST() {
		int n = countNodes(head);
		return sortedListToBSTRecur(n);
		
	}

	private TreeNode sortedListToBSTRecur(int n) {
		if(n <= 0) {
			return null;
		}
		
		TreeNode left = sortedListToBSTRecur(n/2);
		
		TreeNode root = new TreeNode(head.data);
		
		root.left = left;
		
		head = head.next;
		
		root.right = sortedListToBSTRecur(n - (n/2) - 1);
		
		return root;
	}

	private int countNodes(ListNode head) {
		int count = 0;
		ListNode temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	void push(int data) {
		ListNode node = new ListNode(data);
		node.prev = null;
		node.next = null;
		
		if(head != null) {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
			node.next = null;
		}
		else {
			head = node;
		}
	}
	
	void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	void Inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	
	
	
}
