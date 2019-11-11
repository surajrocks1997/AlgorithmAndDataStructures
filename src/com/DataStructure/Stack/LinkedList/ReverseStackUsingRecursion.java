package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Original Stack: " + stack);
		
		reverseStackUsingRecursion(stack);
		
		System.out.println("Reversed Stack: " + stack);

	}

	private static void reverseStackUsingRecursion(Stack<Integer> stack) {
		if(stack.size() > 0) {
			Integer x = stack.peek();
			stack.pop();
			reverseStackUsingRecursion(stack);
			
			insertAtBottom(x, stack);
		}
		
	}

	private static void insertAtBottom(Integer x, Stack<Integer> stack) {
		if(stack.isEmpty())
			stack.push(x);
		else {
			Integer a = stack.peek();
			stack.pop();
			insertAtBottom(x, stack);
			stack.push(a);
		}
		
	}

}
