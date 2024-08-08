//Given an array of integers, sort the integer values.
package javahackathon1;

public class Question3 {

	
	public static void ascSort(int [] arr) {
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<(arr.length-i); j++) {
				
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
			}
		}
	}

	}

	public static void main(String[] args) {
		int[] numArray = new int[] {1,3,2,6,12,10};
		
		System.out.println("Before sorting ");
		for(int i=0; i<numArray.length; i++) {
			System.out.print(numArray[i]+" ");
		
		}
		System.out.println();
		ascSort(numArray);
		System.out.println("After sort");
		
		for(int i=0; i<numArray.length; i++) {
		System.out.print(numArray[i]+ " ");
		}
	}
}
