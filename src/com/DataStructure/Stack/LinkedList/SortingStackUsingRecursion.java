package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class SortingStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
		System.out.println("Original Stack: " + stack);
		
		sortStack(stack);
		
		System.out.println("Sorted Stack: " + stack);
	}

	private static void sortStack(Stack<Integer> stack) {
		if(stack.size() > 0) {
			int x = stack.pop();
			sortStack(stack);
			sort(stack, x);
		}
		
	}

	private static void sort(Stack<Integer> stack, int x) {
		if(stack.isEmpty()) {
			stack.push(x);
		}
		else {
			if(x > stack.peek()) {
				stack.push(x);
			}
			else {
				int a = stack.pop();
				sort(stack, x);
				stack.push(a);
				
			}
		}
		
		
	}

}
