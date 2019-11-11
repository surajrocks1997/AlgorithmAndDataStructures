package com.Sort;

public class InsertionSort1 {

	public static void main(String[] args) {
		
		int[] arr = {
				20, 35, -15, 7, 55, 1, -22
		};
		
		System.out.println("Original Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		insertionSort(arr);
		System.out.println();
		System.out.println("Sorted Index: ");
		for (int j : arr) {
			System.out.print(j + " ");
		}

	}

	private static void insertionSort(int[] arr) {
		int firstUnsortedIndex = 1;
		int i, index;
		for (i = 0; i < arr.length && firstUnsortedIndex<arr.length; i++) {
			 if (arr[i]<arr[firstUnsortedIndex]) {
				 firstUnsortedIndex++;
			}
			 else if(arr[i]>arr[firstUnsortedIndex]) {
				 
				 int j = i;
				 index = firstUnsortedIndex;
				 do {
					 swap(arr, j, index);
					 j--;
					 index--;
					 if(j>=0) {
						 if(arr[j]<arr[index])
							 break; 
					 }
				 }
				 while(j>=0);
				 firstUnsortedIndex++;
			 }
		}		 
	}
	
	 public static void swap(int[] array, int i, int j) {

	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;

	    }
}
