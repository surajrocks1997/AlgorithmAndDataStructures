package com.DataStructure.LinkedList.Doubly;

public class CirclularLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.show();
		
		Node listHead = list.head;
		Node current = listHead;
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = listHead;
		listHead.prev = current;
		current = listHead;
		
		System.out.println();
		System.out.println("Circular Doubly Linked List: ");
		while(current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
			if(current == list.head) {
				break;
			}
		}
	}

}
