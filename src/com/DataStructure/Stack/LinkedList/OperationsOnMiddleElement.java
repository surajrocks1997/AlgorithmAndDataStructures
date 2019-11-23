package com.DataStructure.Stack.LinkedList;
/*
 * Operation to this is based on Doubly Linked List
*/

public class OperationsOnMiddleElement {

	public static void main(String[] args) {
		OperationOnMiddle stack = new OperationOnMiddle();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.showStack();
		stack.MiddleElemet();
		
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.push(77);
		stack.push(88);
		stack.push(99);
		stack.pop();
		stack.showStack();
		stack.MiddleElemet();
		

	}

}

class OperationOnMiddle{
	Node1 head;
	Node1 middle;
	
	public void push(int data) {
		Node1 Node1 = new Node1();
		Node1.data = data;
		Node1.next = null;
		Node1.prev = null;
		
		if(head == null) {
			head = Node1;
		}
		else {
			Node1 n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = Node1;
			Node1.next = null;
			Node1.prev = n;
		}
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("Empty Stack");
		}
		else {
			Node1 current = head;
			Node1 currentPrev = null;
			while(current.next != null) {
				currentPrev = current;
				current = current.next;
			}
			current.prev = null;
			currentPrev.next = null;
			System.out.println("Pop: " + current.data);
		}
	}
	
	public void MiddleElemet() {
		Node1 n1 = head;
		Node1 n2 = head;
		int count = 0;
		while(n1.next != null) {
			n1 = n1.next;
			count++;
		}
		int x = 0;
		while(x != count/2) {
			n2 = n2.next;
			x++;
		}
		middle = n2;
		System.out.println("Middle Element: " + middle.data);
	}
	
	public void showStack() {
		Node1 n = head;
		while(n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data + " ");
	}
}

class Node1{
	int data;
	Node1 next;
	Node1 prev;
}