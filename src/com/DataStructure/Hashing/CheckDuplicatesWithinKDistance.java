package com.DataStructure.Hashing;

import java.util.HashSet;

public class CheckDuplicatesWithinKDistance {

	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
		if (checkDuplicatesWithinK(arr, 3)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	}

	private static boolean checkDuplicatesWithinK(int[] arr, int distance) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);
			
			if(i >= distance) {
				set.remove(arr[i-distance]);
			}
		}
		return false;
	}

}
