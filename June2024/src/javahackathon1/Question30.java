//Write a function to find out longest palindrome in a given string?
package javahackathon1;
public class Question30 {
	public static void main(String[] args) { 
	String input = "hahehahehahehahe";
    
    String palindrome = LongestPalindrome(input);
    
    System.out.println("Longest palindrome of given string is: " + palindrome);
}
	 public static String LongestPalindrome(String str) {
	        if (str == null || str.length() == 0) {
	            return "";
	        }
	        
	        int maxLength = 1;
	        String longestPalindrome = "";
	        
	        // Check each substring in the string
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                String substr = str.substring(i, j);
	                if (isPalindrome(substr) && substr.length() > maxLength) {
	                    maxLength = substr.length();
	                    longestPalindrome = substr;
	                }
	            }
	        }
	        return longestPalindrome;
	    }
	 
	public static boolean isPalindrome(String str) {
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
