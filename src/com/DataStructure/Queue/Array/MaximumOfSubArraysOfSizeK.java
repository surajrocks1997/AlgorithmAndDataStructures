package com.DataStructure.Queue.Array;

import java.util.Scanner;

public class MaximumOfSubArraysOfSizeK {

	public static void main(String[] args) {
		/*
		 * int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		 */
		
		int[] arr =  {
				8, 5, 10, 7, 9, 4, 15, 12, 90, 13
		};
		
		System.out.print("Size: ");
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		Queues queue = new Queues(k);
		
		for (int i = 0; i < arr.length; i++) {
			queue.enqueue(arr[i], arr.length);
		}
		scan.close();
		
	}
}


class Queues{
	 	int front;
	 	int rear;
	 	int size;
	 	int capacity;
	 	int highest;
	 	int[] arr;
	 	int count;
	
	public Queues(int capacity) {
		this.capacity = capacity;
		arr = new int[this.capacity];
		size = 0;
		front = 0;
		rear = 0;
		highest = 0;
		count = 0;
	}
	
	public boolean isFull() {
		if(size == capacity) {
			return true; 
		}
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else 
			return false;	
	}
	
	public void enqueue(int data, int length) {
		if(!isFull()) {
			arr[rear] = data;
			rear = (rear + 1) % (capacity);
			size++;
			count++;
			if(count == length) {
				highest(arr);
			}
			
		}
		else {
			dequeue();
			enqueue(data, length);
		}
		
	}

	public void dequeue() {
		if(!isEmpty()) {
			highest(arr);
			front = (front + 1) % (capacity);
			size--;
		}
		else {
			System.out.println("Empty Queue");
		}
	}

	private void highest(int[] arr2) {
		int i;
		int max = arr[0];
		for (i = 0; i < arr2.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.print(max + " ");
	}
	
}

