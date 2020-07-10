package com.DataStructure.LinkedList.Singly;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LinkedList {

	Node head;
	
	public void insert(int data) 
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		/*If you have empty list, then the node you just created will
		 * be assigned as a Head node and this is what is happening in
		 * the if statement*/
		
		if(head==null)
		{
			head = node;
		}
		/*If you already have a list, then the new node created will be 
		 * added at the end of the list, so for that we have to traverse
		 * the whole list starting with head and traverse until we get null.
		 * As soon as we get null, the new node will be created after the last 
		 * node*/
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		
		head = node;
	}
	
	public void insertBefore(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0)
			insertAtStart(data);
		else {
			Node n = head;
			for(int i = 0; i<index-1;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void insertAt(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;	//garbage collection
		}
	}
	
	public void reverse() {
		Node n = new Node();
		Node current = head;
		Node prev = null;
		while(current!=null)
		{
			n.next = current.next;
			current.next = prev;
			prev = current;
			current = n.next;
		}
		head = prev;
	}
	
	public void reverse1() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
	}
	
	public void swapNode(int i, int j) {
		
		Node currenti = head;
		Node currentj = head;
		Node previ = null;
		Node prevj = null;
		
		if(i==j)
			return;
		
		while(currenti != null && currenti.data != i) {
			previ = currenti;
			currenti = currenti.next;
		}
		while(currentj != null && currentj.data != j) {
			prevj = currentj;
			currentj = currentj.next;
		}
		
		if (currenti == null || currentj == null) 
            return; 
		
		if(previ != null)
			previ.next = currentj;
		else
			head = currentj;
		
		if(prevj != null)
			prevj.next = currenti;
		else
			head = currenti;
		
		Node temp = null;
		temp = currenti.next;
		currenti.next = currentj.next;
		currentj.next = temp;
							
	}
	
public void mergeList(LinkedList listA, LinkedList listB) {
		

		Node dummy = new Node();
		Node tail = dummy;
		
		
		Node currentA = listA.head;
		Node currentB = listB.head;
		Node prevA = null;
		Node prevB = null;
		
		while(currentA != null && currentB != null) {
			if(currentA.data < currentB.data) {
				prevA = currentA;
				currentA = currentA.next;
				prevA.next = null;
				tail.next = prevA;
				tail = tail.next;
			}
			else if(currentB.data < currentA.data) {
				prevB = currentB;
				currentB = currentB.next;
				prevB.next = null;
				tail.next = prevB;
				tail = tail.next;
			}
		}
		while(currentA != null) {
			prevA = currentA;
			currentA = currentA.next;
			prevA.next = null;
			tail.next = prevA;
			tail = tail.next;
		}
		while(currentB != null) {
			prevB = currentB;
			currentB = currentB.next;
			prevB.next = null;
			tail.next = prevB;
			tail = tail.next;
		}
		
		listA.head = dummy.next;
	}

	public Node reverseLLGivenGroupSize(Node head, int k) {
		Node current = head; 
		Node next = null;
		Node prev = null;
	
		int count = 1;
	
		while (count <= k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
	
		if (next != null)
			head.next = reverseLLGivenGroupSize(next, k);
	
		return prev;
		
	}

	public void createloop() {
		Node current = head;
		Node last = head;
		int count = 1;
		while(last.next != null) {
			last = last.next;
			count++;
		}
		Random rand = new Random();
		int random = rand.nextInt(count-1) + 1;
		System.out.println("Random number: " + random);
		int i=1;
		while(i != random) {
			current = current.next;
			i++;
		}
		last.next = current;
		System.out.println("Current Data: " + current.data);
		System.out.println("After last: " + last.next.data);
		System.out.println("Loop has been successfully created.");
		
	}
//	Using HashSet
	public Boolean loopDetection1() {
		
		if(head == null) {
			return false;
		}
		Node current = head;
		Set<String> set = new HashSet<String>();
		while(current.next != null) {
			if(set.contains(current.toString())) {
				return true;
			}
			set.add(current.toString());
			current = current.next;
		}
		return false;
	}

	public Boolean loopDetection() {
		Node slow = head;
		Node fast = head;
		fast = fast.next;
		
		while(slow != fast && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow == fast) {
			removeLoop(fast);
			System.out.println("Loop Successfully Removed.");
			return true;
		}
		else
			return false;
	}

	private void removeLoop(Node fast) {
		Node point1 = head;

		while(point1 != null) {
			Node point2 = fast;
			while(point2.next != point1 && point2.next != fast) {
				point2 = point2.next;
			}
			if(point2.next == point1) {
				point2.next = null;
				break;
			}
			point1 = point1.next;	
		}
	}
	
	public void rotate(int k) {
		Node current = head;
		Node prevOcurrent = null;
		Node end = head;
		Node prevOend = null;
		int count = 1;
		int i = 0;
		
		while(end != null) {
			prevOend = end;
			end = end.next;
			i++;
		}
		
		if(k>i) {
			k = k%i;
		}
		
		while(count != k) {
			prevOcurrent = current;
			current = current.next;
			count++;
		}
		
		prevOend.next = head;
		head = current;
		prevOcurrent.next = null;
		
	}
	
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}
}
