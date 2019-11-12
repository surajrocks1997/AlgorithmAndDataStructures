package com.DataStructure.Queue.Array;

public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueueRunner pqueue = new PriorityQueueRunner(1000);
		pqueue.insert(1,1);
		pqueue.insert(2,2);
		pqueue.insert(4,4);
		pqueue.insert(9,9);
		pqueue.insert(3,3);
		pqueue.insert(6,6);
		
		pqueue.getHighestPriority();
		
		pqueue.deleteHighestPriority();
		
	}

}