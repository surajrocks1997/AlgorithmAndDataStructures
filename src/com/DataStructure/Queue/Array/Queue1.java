package com.DataStructure.Queue.Array;

public class Queue1 {

	public static void main(String[] args) {
	sample queue = new sample(1000);
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	queue.enqueue(5);
	queue.enqueue(6);
	
	queue.dequeue();
	queue.dequeue();
//	queue.dequeue();
//	queue.dequeue();
//	queue.dequeue();
//	queue.dequeue();
	
	
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
		if(!isEmpty()) {
			System.out.println("Front: " + arr[front]);
		}
		else {
			System.out.println("Queue Empty so no front");
		}
	}
	
	public void rear() {
		if(!isEmpty()) {
			System.out.println("Front: " + arr[rear-1]);
		}
		else {
			System.out.println("Queue Empty so no rear");
		}
	}
	
	public void show() {
		if(!isEmpty()) {
			System.out.print("Queue: ");
			for (int i = front; i < rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("Queue Empty");
		}	
	}	
}
