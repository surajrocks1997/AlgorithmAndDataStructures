package com.DataStructure.Queue.Array;

public class Queue1 {

	public static void main(String[] args) {
	Runner1 queue = new Runner1(1000);
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
