package com.DataStructure.Heap;

public class MaxHeap {

	public static void main(String[] args) {

		int[] arr = {
				20, 35, -15, 7, 55, 1, 22, -21
		};
		System.out.println("Original Array: ");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		buildMaxHeap(arr);
		
		System.out.println("Max Heap Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void buildMaxHeap(int[] arr) {
		int heap_size = arr.length-1;
		int x = (arr.length/2)-1;
		for (int i = x; i >= 0; i--) {
			maxHeapify(arr, i, heap_size);
		}
		
		
	}

	private static void maxHeapify(int[] arr, int i, int heap_size) {
 		int l = (2*i)+1;
		int r = (2 * i) + 2;
		int largest;
		
		if (l<=heap_size && arr[l]>arr[i]) {
			largest = l;
		}
		else {
			largest = i;
		}
		
		if (r<=heap_size && arr[r]>arr[i]) {
			largest = r;
		}
		
		
		if (largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, largest, heap_size);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
		
	}
}
