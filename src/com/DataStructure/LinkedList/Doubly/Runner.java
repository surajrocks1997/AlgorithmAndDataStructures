package com.DataStructure.LinkedList.Doubly;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(101);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtHead(4);
		list.insertAtTail(24);
		list.insertAtTail(100);
		list.insertNodeAfter(1, 69);
		list.delete(100);
		list.delete(24);
		
		list.show();

	}

}
