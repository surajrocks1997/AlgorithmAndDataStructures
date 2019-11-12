package com.DataStructure.Queue.LinkedList;

public class PriorityQueue {
	PriorityQueueNode highest;
	PriorityQueueNode front;
	PriorityQueueNode rear;
	
	public void insert(int data, int priority) {
		PriorityQueueNode node = new PriorityQueueNode();
		node.data = data;
		node.priority = priority;
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
			rear = node;
		}
	}
	
	public int getHighestPriority() {
		PriorityQueueNode current = front;
		PriorityQueueNode prev = current;
		current = current.next;
		while(prev != rear.next && current != rear.next) {
			if(prev.priority > current.priority) {
				highest = prev;
				current = current.next;
			}
			else if(current == prev) {
				current = current.next;
			}
			else if(prev.priority <= current.priority) {
				highest = current;
				prev = prev.next;
			}
		}
		return highest.data;
		
	}
	
	public void deleteHighestPriority() {
		int data = getHighestPriority();
		PriorityQueueNode current = front;
		while(current.next.data != data) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	public void show() {
		System.out.println("Queue: ");
		PriorityQueueNode current = front;
		while(current.next != null) {
			System.out.print("(" + current.data + "," + current.priority + ")");
			current = current.next;
		}
		System.out.print("(" + current.data + "," + current.priority + ")");
		System.out.println();
		
	}
}
