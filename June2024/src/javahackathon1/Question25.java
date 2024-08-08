//Write a program for binary search. And 5 i/p has to take from user as binary elements.
package javahackathon1;
import java.util.Scanner;

public class Question25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //Asking user to input binary elements
        int[] arr = new int[5];
        System.out.println("Enter 5 binary elements like 0 and 1 only :");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != 0 && arr[i] != 1) {
                System.out.println("Invalid binary elements.");
                return;
            }
	}
//        Asking user to input key value to search in created array
        System.out.print("Enter the value to search : ");
        int key = sc.nextInt();
        
        if (key != 0 && key != 1) {
            System.out.println("Invalid key.");
            return;
        }
        int keyIndex = binaryElementSearch(arr, key);
        System.out.println("Key found at index " + keyIndex);
        sc.close();
}
	public static int binaryElementSearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; 
    }
	
}
