package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class SpecialStackDataStructure {

	public static void main(String[] args) {
		specialStack stack = new specialStack();
		stack.push(18);
		stack.push(19);
		stack.push(29);
		stack.push(15);
		stack.push(16);

		System.out.println(stack.getMin());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
//		stack.pop();
		System.out.println(stack.getMin());

	}

}

@SuppressWarnings("serial")
class specialStack extends Stack<Integer>{
	Stack<Integer> min = new Stack<Integer>();
	
	void push(int x) {
		if(isEmpty()) {
			super.push(x);
			min.push(x);
		}
		else {
			super.push(x);
			int y = min.pop();
			min.push(y);
			if(x < y) {
				min.push(x);
			}
		}
	}
	
	public Integer pop() {
		int x = super.pop(); 
        int y = min.pop();
        min.push(y);
        if(x == y) {
        	min.pop();
        }
        return x;
	}
	
	int getMin() {
		if(!isEmpty()) {
			int x = min.pop();
			min.push(x);
			return x;
		}
		else {
			System.out.println("Empty Stack...");
		}
		return 0;
	}
	
}