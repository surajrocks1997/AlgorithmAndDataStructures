package com.Sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {
				13, 19, 9, 5, 12, 8, 7, 4, 21, 6, 11
		};
		System.out.println("Original Array: ");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		int x = arr.length;
		quickSort(arr, 0, x-1);
		show(arr);
		
		
	}

	public static void show(int[] arr) {
		System.out.println("Sorted Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	public static void quickSort(int[] arr, int p, int r) {
		if (p<r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
		
	}

	public static int partition(int[] arr, int p, int r) {
		int i = p - 1;
		int j;
		
		for(j=p;j<r;j++) {
			if (arr[j]<=arr[r]) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	public static void swap(int[] arr, int i, int j) {

       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
	}
}
