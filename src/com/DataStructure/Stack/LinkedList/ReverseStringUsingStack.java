package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "This is my PC";
		str = str.replaceAll("\\s", "");
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			stack.push(c);
		}
		int i = 0;
		char[] ch = new char[str.length()];
		while(!stack.isEmpty()) {
			ch[i] = stack.pop();
			i++;
		}
		System.out.print("Reverse String: ");
		for (char c : ch) {
			System.out.print(c);
		}
	}

}
