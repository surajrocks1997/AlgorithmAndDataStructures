package com.DataStructure.Queue.LinkedList;

public class Runner {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.show();
		System.out.println("Front: " + queue.front.data + 
				" & Rear: " + queue.rear.data);
		
		queue.dequeue();
		queue.dequeue();
		queue.show();
		System.out.println("Front: " + queue.front.data + 
				" & Rear: " + queue.rear.data);

		
	}

}
