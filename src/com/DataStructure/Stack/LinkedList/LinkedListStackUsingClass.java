package com.DataStructure.Stack.LinkedList;

import java.util.LinkedList;

public class LinkedListStackUsingClass {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		stack.push(39);
		stack.push(100);
		stack.push(24);
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}

}
