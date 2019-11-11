package com.DataStructure.Queue;

public class Queue1 {

	public static void main(String[] args) {
	sample queue = new sample(5);
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	queue.enqueue(5);
	queue.enqueue(6);
	
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	
	queue.show();
	
	queue.front();
	queue.rear();
	}

}
class sample{

	int size, capacity, front, rear;
	int[] arr;
	
	public sample(int capacity) {
		this.capacity = capacity;
		arr = new int[this.capacity];
		front = this.size = 0;
		rear = 0;
	}

	public void enqueue(int data) {
		if(!isFull()) {
			arr[rear] = data;
			rear = (rear+1)%capacity;
			size++;
		}
		else {
			System.out.println("Queue is Full");
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			int data = arr[front];
			front = (front+1)%capacity;
			size--;
			System.out.println("Dequeue: " + data);
		}
		else {
			System.out.println("Queue Empty");
		}
	}

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
	
	public void front() {
		System.out.println("Front: " + arr[front]);
	}
	
	public void rear() {
		System.out.println("Rear: " + arr[rear]);
	}
	
	public void show() {
		if(!isEmpty()) {
			for (int i = front; i < rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		else {
			System.out.println("Queue Empty");
		}
		
	}
	
	
}
