package com.DataStructure.Stack.Array;

public class KStacksInSingleArray {

	public static void main(String[] args) {
		
		System.out.print("How many stacks: ");
		int k = 3;
		System.out.print("Size of Arrays: ");
		int n = 5;

		KStacks(k,n);
	}

	private static void KStacks(int k, int n) {
		int[] top = new int[k];  	//stores indexes of top elements in all stacks
		int[] next = new int[n];	//stores index of the next item in array arr[]

		int[] arr = new int[n*k];

	}

}
