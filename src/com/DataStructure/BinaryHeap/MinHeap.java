package com.DataStructure.BinaryHeap;

public class MinHeap {

	public static void main(String[] args) {
		
		int[] arr = {
				20, 35, -15, 7, 55, 1, 22, -21
		};
		System.out.println("Original Array: ");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		buildMinHeap(arr);
		
		System.out.println("Min Heap Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void buildMinHeap(int[] arr) {
		
		int heap_size = arr.length-1;
		int x = (arr.length/2)-1;
		for (int i = x; i >= 0; i--) {
			minHeapify(arr, i, heap_size);	
		
		}
	}

	private static void minHeapify(int[] arr, int i, int heap_size) {
	
		int l = (2*i)+1;
		int r = (2 * i) + 2;
		int smallest;
		
		if (l<=heap_size && arr[l]<arr[i]) {
			smallest = l;
		}
		else {
			smallest = i;
		}
		
		if (r<=heap_size && arr[r]<arr[i]) {
			smallest = r;
		
		if(arr[l]<arr[r])
				smallest = l;
		}
		
		if (smallest != i) {
			swap(arr, i, smallest);
			minHeapify(arr, smallest, heap_size);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
		
	}
}
