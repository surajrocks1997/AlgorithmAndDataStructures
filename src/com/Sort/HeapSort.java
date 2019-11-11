package com.Sort;

public class HeapSort{
	public static void main(String[] args) {
		int[] arr = {
				14, 35, 1, 65, 68, 16
		};
		int n = arr.length - 1;
		
		buildHeap(arr, n);
		buildHeap(arr, n);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	private static void buildHeap(int[] arr, int n) {
		
		for (int i = n/2; i >= 0; i--) {
			int left_child = 2*i + 1;
			int right_child = 2*i +2;
			int largest = i;
			
			if(left_child==n) {
				if(arr[left_child] > arr[largest]) {
					swap(arr, left_child, largest);
				}
			}
			else if(left_child < n) {
				if(arr[left_child] < arr[right_child]) {
					swap(arr, left_child, right_child);
				}
				if(arr[left_child] > arr[largest]) {
					swap(arr,left_child, largest);
				}	
			}
		}
	}

	private static void swap(int[] arr,int x, int y) {
		int temp = 0;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}