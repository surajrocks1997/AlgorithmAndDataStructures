package com.DataStructure.Stack.LinkedList;

public class Runner {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.push(50);
		stack.push(75);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
		boolean isEmpty = stack.isEmpty();
		System.out.println("Is Empty? : " + isEmpty);
		
		stack.show();

	}

}
