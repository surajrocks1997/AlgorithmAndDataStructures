package com.DataStructure.Stack.Array;

public class Runner {

	public static void main(String[] args) {
		
		Stack nums = new Stack();					//for class Stack.java
//		DynamicStack nums = new DynamicStack();		//for class DynamicStack.java
		
		nums.push(5);
		nums.push(24);
		nums.push(27);
		System.out.println("Pop : " + nums.pop());
		nums.push(12);
		System.out.println("Peek : " + nums.peek());
		System.out.println("Size : " + nums.size());
		System.out.println("EmptyStack? : " + nums.isEmpty());
		nums.show();
	}

}
