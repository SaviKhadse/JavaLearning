package selfstudy;

public class UniqueArrayElementOccurence{
	public static void main(String[] args) {
		int num = -1;
		int newSign = num < 0 ? 1 : -1;
		System.out.println(newSign);
	}
}

//public class UniqueArrayElementOccurence {
//
//	    public static void main(String[] args) {
//	        int[] array = {4, 5, 2, 5, 4, 3, 1, 2, 5};
//
//	        // Print unique numbers and their occurrences
//	        System.out.println("Unique numbers in the array:");
//	        for (int i = 0; i < array.length; i++) {
//	            // Check if the current element is unique
//	            boolean isUnique = true;
//	            for (int j = 0; j < i; j++) {
//	                if (array[i] == array[j]) {
//	                    isUnique = false;
//	                    break;
//	                }
//	            }
//
//	            if (isUnique) {
//	                // Count occurrences of the unique number
//	                int count = 0;
//	                for (int k = 0; k < array.length; k++) {
//	                    if (array[k] == array[i]) {
//	                        count++;
//	                    }
//	                }
//	                System.out.println(array[i] + " occurs " + count + " time(s)");
//	            }
//	        }
//	    }
//	}
//
//
//
//
//
//public class GFG {
//	 
//    // Method 1
//    // To print the unique words
//    static void printUniqueWords(String str)
//    {
//        // Maintaining a count variable
//        int count;
// 
//        // Extract words from string
//        // using split() method
//        String[] words = str.split("\\W");
// 
//        // Iterating over the words array
//        for (int i = 0; i < words.length; i++) {
// 
//            // Setting count of current word to one
//            count = 1;
// 
//            for (int j = i + 1; j < words.length; j++) {
//                if (words[i].equalsIgnoreCase(words[j])) {
// 
//                    // If word found later in array
//                    // increment the count variable
//                    count++;
// 
//                    words[j] = "";
//                }
//            }
// 
//            // If count of current word is one print it
//            if (count == 1 && words[i] != "")
// 
//                // Print statement
//                System.out.println(words[i]);
//        }
//    }
// 
//    // Method 2
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Custom input string
//        String str = "Welcome to geeks for geeks";
// 
//        // Calling the method 1 to print all unique words
//        // in above string passed as argument
//        printUniqueWords(str);
//    }
//}