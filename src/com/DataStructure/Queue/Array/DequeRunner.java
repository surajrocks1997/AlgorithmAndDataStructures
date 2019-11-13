package com.DataStructure.Queue.Array;

public class DequeRunner {

	public static void main(String[] args) {
	Deque deque = new Deque();	
	deque.insertRearEnd(5);
	deque.insertRearEnd(10);
	deque.deleteFromRear();
	deque.insertFrontEnd(15);
	deque.deleteFromFront();
	}
}
