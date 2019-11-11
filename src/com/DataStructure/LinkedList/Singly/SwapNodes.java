package com.DataStructure.LinkedList.Singly;

public class SwapNodes {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(15);
		list.insert(12);
		list.insert(13);
		list.insert(20);
		list.insert(14);
		System.out.println("List before calling swap: ");
		list.show();
		
		list.swapNode(12,20);
		
		System.out.println("List after calling swap: ");
		list.show();
	}

}
