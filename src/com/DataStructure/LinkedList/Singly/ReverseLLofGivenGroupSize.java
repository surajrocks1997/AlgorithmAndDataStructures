package com.DataStructure.LinkedList.Singly;

public class ReverseLLofGivenGroupSize {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
//		list.insert(8);
//		list.insert(9);
		
		list.head = list.reverseLLGivenGroupSize(list.head, 3); 
		
		list.show();

	}

}
