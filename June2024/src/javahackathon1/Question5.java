//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
package javahackathon1;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		
	        int[] numArray = {1,3,2,4,3,3,8,9,5,5};

	        // Sort the array using sort method
	        Arrays.sort(numArray); // After sorting {1,2,3,3,3,4,5,5,8,9}

	        System.out.println("Unique numbers in the array:");
	        int count = 1; 
	        for (int i = 0; i < numArray.length; i++) {
	
	            if (i == numArray.length - 1 || numArray[i] != numArray[i + 1]) {
	                System.out.println(numArray[i] + " occurs " + count + " time");
	                count = 1; 
	            } else {
	                count++; // Increasing count for duplicates
	            }
	        }
	}
	}
	
//	public static void uniqueArr(int[] intArray) {
//		int count=1;
//		int[] copyArray = {};
//		
//	
//		int j=0;
//		for(int i=0; i<=intArray.length; i++) {
//			if(copyArray.add(intArray[i])) {
////			if(intArray[j]!=copyArray[i]) {
//				copyArray[i] +=intArray[0];
//				j++;
//			}
//			
//		}
//		System.out.println(Arrays.toString(copyArray));
//	}
//
//}
