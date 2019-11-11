package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class VerifyingBalancedParanthesis {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String str = "[{} {()} {[]}]";
		str = str.replaceAll("\\s", "");
		System.out.println("Expression: " + str);
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c=='[' || c=='{' || c=='(') {
				stack.push(c);
			}
			else if(c==']' || c=='}' || c==')') {
				if((c==']' && stack.peek()== '[') || 
						(c=='}' && stack.peek()=='{') || 
						(c==')' && stack.peek()=='(') ) {
					stack.pop();
				}
				else {
					continue;
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}
		else
			System.out.println("Not Balanced");
	}

}
