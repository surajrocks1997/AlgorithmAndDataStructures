package com.DataStructure.LinkedList.Doubly;

public class LinkedList {
	
	Node head;
	
	public void insert(int i) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			head= node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n= n.next;
			}
			n.next = node;
			node.prev = n;
			node.next = null;
		}
		
	}
	
	public void insertAtHead(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			head = node;
		}
		else {
			head.prev = node;
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtTail(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			node = head;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
			node.next = null;
		}
	}

	public void insertNodeAfter(int i, int j) {
		Node newNode = new Node();
		newNode.data = j;
		newNode.next = null;
		newNode.prev = null;
		
		Node node = head;
		Node prev = null;
		while(node.next != null) {
			prev = node;
			node = node.next;
			if(prev.data == i) {
				prev.next = newNode;
				newNode.next = node;
				newNode.prev = prev;
				node.prev = newNode;
				break;
			}
		}
	}
	
	public void delete(int i) {
		Node node = head;
		Node prev = null;
		while(node.next != null) {
			if(head.data == i) {
				head = head.next;
				head.prev = null;
				break;
			}
			else if(node.data == i) {
				prev.next = node.next;
				node.next.prev = prev;
				break;
			}
			prev = node;
			node = node.next;
		}
		if(node.data == i && node.next == null) {
			node.prev.next = null;
		}
	}	
	
	public void show() {
		Node node = head;
		System.out.println("Forward: ");
		while(node.next!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
		
		System.out.println("Reverse: ");
		Node node1 = head;
		while(node1.next != null) {
			node1 = node1.next;
		}
		while(node1 != null) {
			System.out.print(node1.data + " ");
			node1 = node1.prev;
		}
	}

	public void reverse() {
		Node current = head;
		Node next = current.next;
		Node prev = null;
		
		while(next.next != null) {
			current.next = prev;
			prev = current;
			current = next;
			next = next.next;
			prev.prev = current;
			current.next = prev;
			current.prev = next;
		}
		next.next = current;
		next.prev = null;
		head = next;
	}
	
	public Node getHead() {
		return head;
	}
}
