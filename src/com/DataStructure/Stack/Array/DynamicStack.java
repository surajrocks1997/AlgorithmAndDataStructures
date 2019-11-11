package com.DataStructure.Stack.Array;

public class DynamicStack {

	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	
	public void push(int data)
	{
		if(top==capacity)
		{
			extendStack();
		}
		
		stack[top] = data;
		top++;
	}

	private void extendStack() {
		capacity = capacity*2;
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, stack.length);
		stack = newStack;	
	}
	
	public int pop()
	{
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Stack is empty!!");
		}
		else {
			top--;
			
			data = stack[top];
			stack[top] = 0;
			shrinkStack();
		}
		return data;
	}
	
	private void shrinkStack() {
		if(top<=(capacity/2)/2)
			capacity = capacity/2;
		
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, stack.length);
		stack = newStack;
		
	}

	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size() 
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	public void show() 
	{
		for(int n: stack)
			System.out.println("n : " + n);
		System.out.println();
	}
	
}
