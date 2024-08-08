//Write Java Program to perform ascending order Selection sort

package javahackathon1;
import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		int[] numArray = {1,4,6,7,9,3,2,5};
		int arrLen = numArray.length;
		int temp;
		for (int j=arrLen; j > 0; j-- ) {
		for(int i=0; i<arrLen-1; i++) {
				if((i==numArray.length-1) ||(numArray[i]>numArray[i+1])) {
					temp=numArray[i+1];
					numArray[i+1]=numArray[i];
					numArray[i]=temp;
				}	
			}
			
//				arrLen--;
		}
		System.out.println("sorted array: "+ Arrays.toString(numArray));
		}
	
	}


