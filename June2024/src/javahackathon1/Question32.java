//You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order
package javahackathon1;

public class Question32 {
	 public static void main(String[] args) {
	        int[] array1 = {1, 3, 5, 7, 0, 0, 0, 0}; 
	        int[] array2 = {2, 4, 6, 8};

	        int m = 4; // Number of elements in A initially (excluding buffer)
	        int n = array2.length; // Number of elements in B
	        System.out.println("The merged and sorted array is: ");
	        merge(array1, m, array2, n);

	        // Print merged array 
	        for (int num : array1) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void merge(int[] array1, int m, int[] array2, int n) {
	        int i = m - 1; // Index in A (excluding buffer)
	        int j = n - 1; // Index in B
	        int k = m + n - 1; // Index in merged array A

	        // Merge A and B from the end
	        while (i >= 0 && j >= 0) {
	            if (array1[i] > array2[j]) {
	            	array1[k--] = array1[i--];
	            } else {
	            	array1[k--] = array2[j--];
	            }
	        }

	        // Copy remaining elements of B into A if any
	        while (j >= 0) {
	        	array1[k--] = array2[j--];
	        }
	    }
	}