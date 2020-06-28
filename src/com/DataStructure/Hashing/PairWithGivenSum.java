package com.DataStructure.Hashing;

import java.util.HashSet;

public class PairWithGivenSum {

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8, 5 }; 
		int sum = 9; 
		printpairs(A, sum);
	}

	private static void printpairs(int[] a, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			int temp = sum - a[i];
			
			if(set.contains(temp)) {
				System.out.println(a[i] + " , " + temp);
			}
			set.add(a[i]);
			
		}
		
	}

}
