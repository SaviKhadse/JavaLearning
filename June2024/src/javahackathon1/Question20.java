//WJP to find total number of repeated integers, uppercase and lowercase character in the give string

package javahackathon1;

public class Question20 {

	public static void main(String[] args) {
		
		String str = "Welcome to Java Session June 2024.";
		repeatNumUpperLowerChar(str);
	}
	
	public static void repeatNumUpperLowerChar(String str) {
		char[] ch =str.toCharArray();
		int integerCount=0;
		int uppercaseCount=0;
		int lowercaseCount=0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == '\0') {
				continue;
			}
				if(Character.isDigit(ch[i])) {
					integerCount++;
				}
				
				if(Character.isUpperCase(ch[i])) {
					uppercaseCount++;
				}
				if(Character.isLowerCase(ch[i])) {
					lowercaseCount++;
				}
			}
			
		System.out.println("The digit count in string is: "+integerCount);
		System.out.println("The uppercase count in string is: "+uppercaseCount);
		System.out.println("The lowercase count in string is: "+lowercaseCount);
	}

}
