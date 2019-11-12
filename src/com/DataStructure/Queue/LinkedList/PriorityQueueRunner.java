package com.DataStructure.Queue.LinkedList;

public class PriorityQueueRunner {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.insert(1,1);
		queue.insert(2,2);
		queue.insert(4,4);
		queue.insert(9,9);
		queue.insert(3,3);
		queue.insert(6,6);
		System.out.println("Highest Priority Data: " + queue.getHighestPriority());
		queue.show();
		
		queue.deleteHighestPriority();
		queue.deleteHighestPriority();
		queue.show();
	}
}
