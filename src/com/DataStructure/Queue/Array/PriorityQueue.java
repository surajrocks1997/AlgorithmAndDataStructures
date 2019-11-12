package com.DataStructure.Queue.Array;

public class PriorityQueue {
	int data, priority;
	int front, rear, size, capacity;
	PriorityQueueData[] arr;
	
	public PriorityQueue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = 0;
		arr = new PriorityQueueData[this.capacity];
	}
	
	boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else
			return false;
	}
	
	boolean isFull() {
		if(size == this.capacity) {
			return true;
		}
		else
			return false;
	}
	
	public void insert(int data, int priority) {
		PriorityQueueData obj = new PriorityQueueData();
		obj.data = data;
		obj.priority = priority;
		
		if(!isFull()) {
			arr[rear] = obj;
			rear++;
			size++;
		}
		
		else {
			System.out.println("Queue is FULL");
		}
	}
	
	public void getHighestPriority() {
		PriorityQueueData highest = arr[front];
		int i=0;
		int j = i+1;
		while(i<rear && j<rear) {
			if(arr[i].priority > arr[j].priority) {
				highest = arr[i];
				j++;
			}
			else if(i==j)
				j++;
			
			else if(arr[j].priority >= arr[i].priority) {
				highest = arr[j];
				i++;
			}
			
		}
		System.out.println("Highest: " + highest.data);
	}

	public void deleteHighestPriority() {
		PriorityQueueData highest = arr[front];
		int i=0;
		int j = i+1;
		while(i<rear && j<rear) {
			if(arr[i].priority > arr[j].priority) {
				highest = arr[i];
				j++;
			}
			else if(i==j)
				j++;
			
			else if(arr[j].priority >= arr[i].priority) {
				highest = arr[j];
				i++;
			}	
		}
		
		int a;
		for (a = front; a < rear; a++) {
			if(arr[a] == highest) {
				a++;
				System.out.println("Index of Highest: " + a);
				break;
			}
		}
		a--;
		
		while(a != rear-1) {
			arr[a] = arr[a+1];
			a++;
		}
		rear--;
		size--;
		
	}

	public void show() {
		System.out.println("Queue: ");
		for (int i = front; i < rear; i++) {
			System.out.print("(" + arr[i].data + "," + arr[i].priority + ")");
		}
		
	}

}