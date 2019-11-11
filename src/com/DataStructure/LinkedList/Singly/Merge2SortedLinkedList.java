package com.DataStructure.LinkedList.Singly;

public class Merge2SortedLinkedList {

	public static void main(String[] args) {
		
		LinkedList listA = new LinkedList();
		LinkedList listB = new LinkedList();
		
		listA.insert(5);
		listA.insert(10);
		listA.insert(15);
		listA.insert(1);
		listA.insert(121);
		
		listB.insert(2);
		listB.insert(3);
		listB.insert(20);
		
		listA.mergeList(listA, listB);
		
		listA.show();

	}

}
