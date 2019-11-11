package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr = {
				11, 13, 21, 3
		};
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
			int next = i;
			next++;
			
			while(next != arr.length) {
		
				if(arr[next] > stack.peek()) {
					System.out.println(stack.peek() + " : "  + arr[next]);
					count++;
					stack.pop();
					break;
				}
				else if(i==0 && arr[0] == maxofArray(arr)) {
					System.out.println(stack.peek() + " : -1");
					stack.pop();
					count++;
					break;
				}
				else
					next++;
			}
		}
		for(int i = count; i < arr.length ; i++) {
			System.out.println(arr[i] + " : -1");
		}
	}

	private static Integer maxofArray(int[] arr) {
		int i = 1;
		while(i != arr.length) {
			if(arr[0] > arr[i]) {
				i++;
			}
			else 
				return arr[1];
		}
		return arr[0];
	}

}
