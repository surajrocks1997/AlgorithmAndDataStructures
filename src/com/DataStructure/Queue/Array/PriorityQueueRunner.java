package com.DataStructure.Queue.Array;

public class PriorityQueueRunner {

	public static void main(String[] args) {
		PriorityQueue pqueue = new PriorityQueue(1000);
		pqueue.insert(1,1);
		pqueue.insert(2,2);
		pqueue.insert(4,4);
		pqueue.insert(9,9);
		pqueue.insert(3,3);
		pqueue.insert(6,6);
		pqueue.show();
		
		pqueue.getHighestPriority();
		
		pqueue.deleteHighestPriority();
		pqueue.show();
	}	
}

	
