package com.DataStructure.LinkedList.Doubly;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		System.out.println("Before Reversing: ");
		list.show();
		System.out.println();
		list.reverse();
		System.out.println("After Reversing: ");
		list.show();

	}

}
