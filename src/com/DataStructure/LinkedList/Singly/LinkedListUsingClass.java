package com.DataStructure.LinkedList.Singly;

import java.util.LinkedList;

public class LinkedListUsingClass {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(7);
		list.addFirst(21);
		list.add(64);
		list.remove(0);
		list.removeFirst();
		list.add(19);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		//printing using iterator
		
//		Iterator iter = list.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}

}
