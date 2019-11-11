package com.DataStructure.Stack.LinkedList;

public class Stack {
	
	Node head;
	Node top;

	public void push(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
			top = node;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
			top = node;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!!");
		}
		else {
			Node current = head;
			while(current.next != null) {
				top = current;
				current = current.next;
			}
			if(current == top) {
				top = null;
			}
			else {
				top.next = null;
			}
			
			System.out.println(current.data + " : Popped.");
		}
	}

	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!!");
		}
		else {
			System.out.println(top.data + " : Top.");
		}
		
	}

	public void show() {
		Node current = head;
		System.out.print("Stack: ");
		if(top == null) {
			System.out.print("Empty Stack...");
		}
		else {
			while(current.next != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println(current.data);
		}
		
	}
	
	
}
