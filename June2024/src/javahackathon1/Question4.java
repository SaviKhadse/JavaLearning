//Given an array of integers check the Palindrome of the series.

package javahackathon1;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		int[] numArray = new int[] {1,3,2,6,12};
		int[] numArray1 = new int[] {1,2,3,2,1};
		palindrome(numArray);
		
		System.out.println("numArray is: "+palindrome(numArray));
		System.out.println("numArray1 is: "+palindrome(numArray1));
		
	}
	
public static boolean palindrome(int[] intArray) { 	//[1,2,3,2,1]
//	int left = 0;
//    int right = intArray.length - 1;
//    int temp;
	
//	int[] copyArray= new int[intArray.length];
//    for(int i=intArray.length - 1; i>=0; i-- ) {
//    	 copyArray[i]+= intArray[i];
    	
//    	int temp = intArray[i];
//    	intArray[i] = intArray[intArray.length - i - 1];
//    	intArray[intArray.length - i - 1] = temp;
    	
    
//    if(copyArray.equals(intArray)) {
//    	System.out.println("palindrome");
//    }else
//    	System.out.println("Not a palindrome");
//    }
    
    int left = 0;
    int right = intArray.length - 1;
    while (left < right) {
        if (intArray[left] != intArray[right]) {
            return false;
        }
        left++;
        right--;
    }return true;
  
}

}
