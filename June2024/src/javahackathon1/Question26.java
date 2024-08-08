//WJP to merge two sorted array.(Do not use third array) 
//array1[10] = 1,2,4,6,9,10 array2[4] = 3,5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
package javahackathon1;
import java.util.Arrays;

public class Question26 {
	 public static void main(String[] args) 
	    {
	        int[] array1 = new int[] {1,2,4,6,9,10};
	        int[] array2 = new int[] {3,5,7,8};
	         
	        int[] mergedArray1 = mergeArray(array1, array2);

	        System.out.println("Merged Array1 : "+Arrays.toString(mergedArray1));
	    }
	 public static int[] mergeArray(int[] array1, int[] array2)
	    {
	        int[] mergedArray = new int[array1.length + array2.length];
	         
	        int i=0, j=0, k=0;
	         
	        while (i < array1.length && j < array2.length)
	        {
	            if (array1[i] < array2[j]) 
	            {
	                mergedArray[k] = array1[i];
	                i++;
	                k++;
	            } 
	            else
	            {
	                mergedArray[k] = array2[j];
	                j++;
	                k++;
	            }
	        }        
	        while (i < array1.length) 
	        {
	            mergedArray[k] = array1[i];
	            i++;
	            k++;
	        } 
	                 
	        while (j < array2.length) 
	        {
	            mergedArray[k] = array2[j];
	            j++;
	            k++;
	        } 
	        return mergedArray;
	    }
}