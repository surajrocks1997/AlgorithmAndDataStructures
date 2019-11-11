package com.DataStructure.LinkedList.Singly;

public class MergeSortForLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(24);
		list.insert(68);
		list.insert(72);
		list.insert(16);
		list.insert(18);
		list.insert(27);
		list.insert(94);
		System.out.print("Original List: ");
		list.show();
//		list.mergeSort(list.head); 
		
		System.out.print("After sorting: ");
		list.show();
		
		
		

	}

}
