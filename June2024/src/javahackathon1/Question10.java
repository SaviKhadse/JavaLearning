//What is String subSequence method?

package javahackathon1;

public class Question10 {

	public static void main(String[] args) {
		String str = new String("hackathon");
		System.out.println("Subsequence of "+str+ " is: "+str.subSequence(0, 4));
//		String subsequence method is similar to substring method where it gives a sequence of
//		character that is subsequence of given string except it gives char sequence rather than string
//		Also it accepts parameter such as "begin" and "end" and print subsequence excluding end index.

	}

}
