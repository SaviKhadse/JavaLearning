//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

package javahackathon1;

public class Question13 {

	public static void main(String[] args) {
		String str = "Java Code";
		String newstr="";
		char ch;
		System.out.println("Original string is: "+str);
		for(int i=0; i<str.length(); i++) {
			
			ch=str.charAt(i);
			newstr=ch+newstr;
		}
		System.out.println("Reversed tring is: "+newstr);
	}

}








