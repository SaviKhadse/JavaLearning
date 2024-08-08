//Write a program to check palindrome (MalayalaM) for both numbers and string?
package javahackathon1;

import java.util.Arrays;

public class Question12 {

	public static void main(String[] args) {
		
		String str = "MalayalaM";
		System.out.println(Palindrome(str));
		
	}
	
	public static boolean Palindrome(String str) {
		str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
}
