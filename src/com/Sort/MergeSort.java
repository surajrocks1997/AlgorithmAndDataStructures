package com.Sort;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = {
				15, -64, 94, -34, 25, 67, -41
		};
		
		mergeSort(array, 0, array.length-1);

		for(int n: array)
			System.out.print(n + " ");
	}

	private static void mergeSort(int[] array, int p, int r) {
		if(p<r)
		{
			int q = (p+r)/2;
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, q, r);
		}
		
	}

	private static void merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = array[p+i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = array[q+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = p;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j])
			{
				array[k]=L[i];
				i++;
				k++;
			}
			else
			{
				array[k]=R[j];
				j++;
				k++;
			}
		}
		
		while (i < n1) 
	    { 
	        array[k] = L[i]; 
	        i++; 
	        k++; 
	    } 

	    while (j < n2) 
	    { 
	        array[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	}

}
