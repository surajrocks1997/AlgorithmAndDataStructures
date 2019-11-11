package com.DataStructure.Queue.Array;

public class Runner {
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(9);
		q.enQueue(1);
		
		System.out.println("Size: " + q.getSize());
		System.out.println("Empty?: " + q.isEmpty());
		System.out.println("Full? : " + q.isFull());
		q.show();
	}
	
}
