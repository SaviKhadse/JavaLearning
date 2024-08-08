//WJP to find total number of integers, uppercase and lowercase character in the give string

package javahackathon1;

public class Question17 {

	public static void main(String[] args) {
		String str="Welcome to Java session June 2024";
		
		int integerCount=0;
		int uppercaseCount=0;
		int lowercaseCount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				integerCount++;
			}
			else if(Character.isLowerCase(ch)) {
				lowercaseCount++;
			}
			else if(Character.isUpperCase(ch)){
				uppercaseCount++;
			}
		}
		System.out.println("Integer count in string str is: "+integerCount);
		System.out.println("lowercase count in string str is: "+lowercaseCount);
		System.out.println("uppercase count in string str is: "+uppercaseCount);
	}

}
