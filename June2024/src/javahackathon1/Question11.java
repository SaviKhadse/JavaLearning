//How to Split String in java?
package javahackathon1;

public class Question11 {

	public static void main(String[] args) {
		String str = new String("hackathon@tekarck.com");
		String[] newstr = str.split("@",2);
		String[] newstr1 = str.split("",5);
		
		System.out.println("original string: "+str);
		System.out.println();
		
		System.out.println("After Split str: " );
		for(String s:newstr)
			System.out.println(s);
		
		System.out.println("After split Str1: ");
		for(String s:newstr1)
			System.out.println(s);
//		System.out.println("original string: "+);
		
//		The split() method splits a string into an ARRAY of substrings but does not change original string.
//		The split() method splits a string into an array of substrings using a regular expression 
//		as the separator. By default limit is "0". If exclude separator will split as per limit.
//		Syntax: string.split(separator, limit)

	}

}
