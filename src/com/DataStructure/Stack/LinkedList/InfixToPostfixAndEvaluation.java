package com.DataStructure.Stack.LinkedList;

import java.util.Stack;

public class InfixToPostfixAndEvaluation {

	public static void main(String[] args) {
		String expression = "a+b*(c^d-e)^(f+g*h)-i";
		
		System.out.println("String: " + expression);
		String result = infixToPostfix(expression);
		System.out.println("Postfix Expression: " + result);	//Infix to Postfix
		
		String expression1 = "231*+9-";
		System.out.println("Evaluate: " + expression1);
		evaluation(expression1);		//Postfix Expression Evaluation

	}

	private static void evaluation(String result) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < result.length(); i++) {
			char c  = result.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				stack.push(c - '0');
			}
			else {
				int num2 = stack.pop();
				if(stack.isEmpty()) {
					System.out.println("Invalid Expression");
					break;
				}
				int num1 = stack.pop();
				
				switch(c) {
				case '+':
					stack.push(num1 + num2);
					break;
				case '-':
					stack.push(num1 - num2);
					break;
				case '*':
					stack.push(num1 * num2);
					break;
				case '/':
					stack.push(num1 / num2);
					break;
				}
			}
		}
		
		System.out.println("Result: " + stack.pop());
		
	}

	private static String infixToPostfix(String expression) {
		String result = new String();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result += c;
			}
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				} 
                  
                if (!stack.isEmpty() && stack.peek() != '(') {
                    System.out.println("Invalid Expression");
                    break;
                }
                else {
                	stack.pop();
                } 
			}
			else {
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
					if(stack.peek() == '(') {
						System.out.println("Invalid Expression");
					}
                    result += stack.pop(); 
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()){ 
            if(stack.peek() == '(') {
            	System.out.println("Invalid Expression");
            }
            result += stack.pop(); 
         } 
        return result; 
	}
	static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

}
