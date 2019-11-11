package com.DataStructure.LinkedList.Singly;

public class CircularLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);	
		
		Node listHead = list.head;
		Node current = listHead;
		while(current.next != null) {
			current = current.next;
		}
		current.next = listHead;
		current = listHead;
		
		while(current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
			if(current == list.head) {
				break;
			}
		}	
	}

}
