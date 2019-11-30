package com.DataStructure.BinaryTree.Array;

public class BinaryTree {
	int root = 0;
	String[] str = new String[10];
	
	public void root(String data) {
		str[0] = data;
	}
	
	public void setLeft(String data, int root) {
		int t = (root * 2) + 1;
		
		if(str[root] == null) {
			System.out.println("No Parent Found");
		}
		else {
			str[t] = data;
		}
	}
	
	public void setRight(String data, int root) {
		int t = (root * 2) + 2;
		
		if(str[root] == null) {
			System.out.println("No Parent Found");
		}
		else {
			str[t] = data;
		}
	}
	
	public void printTree() {
		for (int i = 0; i < str.length; i++) {
			if(str[i] != null) {
				System.out.print(str[i] + " ");
			}
		}
	}
	
}
