package com.DataStructure.LinkedList.Doubly;

public class QuickSort {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(80);
		list.insert(30);
		list.insert(90);
		list.insert(40);
		list.insert(50);
		list.insert(70);
		System.out.println("Original List: ");
		list.show();

		Node end = list.head;
		while(end.next != null) {
			end = end.next;
		}
		
		getPivotRightPlace(list, list.head, end);
		System.out.println();
		System.out.println("Pivot at right place: ");
		list.show();
		
;
	}

	private static void getPivotRightPlace(LinkedList list, Node head, Node end) {
		Node current = head;
		Node dummy = new Node();
		Node prev = dummy;
		dummy.next = current;
		while(current.next != null) {
			if(current.data < end.data) {
				prev = prev.next;
				prev = swap(current, prev);
				current = current.next;
			}
			else {
;				current = current.next;
			}
		}
		Node prevNext = prev.next;
		prev.next = end;
		end.next = prevNext;
		prevNext.next.next = null;
		prevNext.prev = end;
		end.prev = prev;
		
	}

	private static Node swap(Node current, Node prev) {
		if(prev.next == current) {
			Node prevPrev = prev.prev;
			prev.next = current.next;
			current.next = prev;
			prev.prev = current;
			current.prev = prevPrev;
			prevPrev.next = current;
			prev.next.prev = prev; 
			Node temp = prev;
			prev = current;
			current = temp;
			prev = current.prev;
		}
		
		else if(prev.next != current) {
			if(current.prev != null || prev.prev != null) {
				Node prevPrev = prev.prev;
				Node prevNext = prev.next;
				prev.next = current.next;
				current.next = prevNext;
				prevNext.next = prev;
				prevPrev.next = current;
				current.prev = prevPrev;
				prevNext.prev = current;
				prev.prev = prevNext;
				prev.next.prev = prev;
				Node temp = prev;
				prev = current;
				current = temp;
			}
		}
		return prev;
	}

}