package com.DataStructure.Stack.Array;

public class TwoStacksInAnArray {

	public static void main(String[] args) {
		TwoStackImplementation stacks = new TwoStackImplementation(5);
		stacks.push1(1);
		stacks.push2(2);
		stacks.push1(3);
		stacks.push2(4);
		stacks.push1(5);
		
		stacks.pop1();
		stacks.pop2();
		stacks.pop1();
		stacks.pop2();
		stacks.pop1();
		stacks.pop2();
	
	}
}

class TwoStackImplementation{
	int[] arr;
	int top1, top2;
	int size;

	public TwoStackImplementation(int i) {
		arr = new int[i];
		size = i;
		top1 = -1;
		top2 =  size-1;
	}
	public void push1(int x) {
		if(top1 < top2) {
			top1++;
			arr[top1] = x;
		}
		else {
			System.out.println("Stack Oveflow!!!");
		}
	}
	public void push2(int x) {
		if(top2 > top1) {
			arr[top2] = x;
			top2--;
		}
		else {
			System.out.println("Stack Overflow!!!");
		}
	}
	public void pop1() {
		int x = 0;
		if(top1!=-1) {
			x = arr[top1];
			arr[top1] = 0;
			top1--;
			System.out.println(x + " : Popped");
		}
		else {
			System.out.println("Stack empty");
		}
	}
	
	public void pop2() {
		int x = 0;
		if(top2+1 == size) {
			System.out.println("Stack empty");
		}
		else {
			top2++;
			x = arr[top2];
			arr[top2] = 0;
			System.out.println(x + " : Popped");
		}
	}

}
