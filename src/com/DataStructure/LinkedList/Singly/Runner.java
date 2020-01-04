package com.DataStructure.LinkedList.Singly;

public class Runner {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(21);
		list.insert(15);
		list.insert(57);
		list.insert(13);
		list.insertAtStart(51);
		list.insertAt(2, 12);
		//list.deleteAt(2);
		
		list.show();
		list.reverse();
		list.show();
		list.reverse1();
		list.show();
	}

}
