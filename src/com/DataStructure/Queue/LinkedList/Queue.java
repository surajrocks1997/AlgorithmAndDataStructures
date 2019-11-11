package com.DataStructure.Queue.LinkedList;

public class Queue {
	Node rear;
	Node front;
	
	public void enqueue(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(front == null) {
			front = node;
		}
		else {
			rear = front;
			while(rear.next != null) {
				rear = rear.next;
			}
			rear.next = node;
			rear = rear.next;
		}
	}
	
	public void dequeue() {
		if(front != null) {
			front = front.next;
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	
	public void show() {
		Node current = front;
		System.out.print("Queue: ");
		while(current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(current.data);
	}
}
