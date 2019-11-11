package com.DataStructure.LinkedList.Singly;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(93);
		list.insert(17);
		list.insert(15);
		list.insert(68);
		list.insert(64);
		list.insert(57);

		list.reverse();
		
		list.show();
	}
}
