package com.DataStructure.Graphs.AdjacencyList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(4);
		
		Iterator<Integer> iter = list.listIterator();
		while(iter.hasNext()) {
			int i = iter.next();
			System.out.print(i + " ");
		}
		

	}

}
