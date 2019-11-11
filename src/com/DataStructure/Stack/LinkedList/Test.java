package com.DataStructure.Stack.LinkedList;

public class Test {

	public static void main(String[] args) {
		String expression = "GeeksForGeeks";
		char[] c = new char[expression.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = expression.charAt(i);
		}
		
		for (char d : c) {
			System.out.print(d + " ");
		}

	}

}
