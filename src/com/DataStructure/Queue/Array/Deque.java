package com.DataStructure.Queue.Array;

public class Deque {

	int[] arr = new int[1000];
	int capacity = 1000;
	int size = 0;
	int front = -1;
	int rear = 0;
	
	boolean isFull() {
		if(size == capacity) {
			return true;
		}
		else
			return false;
	}
	
	boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else 
			return false;
	}
	public void insertFrontEnd(int data) {
		if(!isFull()) {
			if(front == -1) {
				front++;
				arr[front] = data;
				size++;
			}
			else if(front == 0) {
				front = size - 1;
				arr[front] = data;
				size++;
			}
			else {
				front--;
				arr[front] = data;
				size++;
			}
		}
		else
			System.out.println("Deque Full");
	}
	
	public void insertRearEnd(int data) {
		if(!isFull()) {
			if(rear == size-1) {
				rear = 0;
			}
			else {
				rear++;
				arr[rear] = data;
				size++;
			}
		}
		else
			System.out.println("Deque Full");
	}
	
	public void deleteFromRear() {
		if(!isEmpty()) {
			if(front == rear) {
				front = -1;
				rear = -1;
				size--;
			}
			else if(rear == 0) {
				rear = size - 1;
				size--;
			}
			else {
				rear = rear - 1;
				size--;
			}
		}
	}
	
	public void deleteFromFront() {
		if(!isEmpty()) {
			if(front == rear) {
				front = -1;
				rear = -1;
				size--;
			}
			else if(front == size - 1) {
				front = 0;
				size--;
			}
			else {
				front = front + 1;
				size--;
			}
		}
	}

	public void show() {
		System.out.println("Deque: ");
		
		for (int i = front; i <=rear; i++) {
			System.out.print(arr[i] + " ");
		}	
		
		System.out.println();
		
		
	}
}
