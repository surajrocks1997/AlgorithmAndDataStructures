package com.DataStructure.LinkedList.Singly;

import java.util.Scanner;

public class RotateLinkedList {

	private static Scanner scan;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(70);
		System.out.println("Original List: ");
		list.show();
		
		System.out.print("Enter a number: ");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		list.rotate(num);
		
		System.out.println("After rotating the array: ");
		list.show();

	}

}
