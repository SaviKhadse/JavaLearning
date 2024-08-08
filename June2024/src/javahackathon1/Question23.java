//WJP to differentiate input as string, int or bool

package javahackathon1;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your input: ");
        
        String input = scanner.nextLine().trim();
        
        if (isBoolean(input)) {
            System.out.println("Input is Boolean ");
        } else if (isInteger(input)) {
            System.out.println("Input is Integer");
        } else {
            System.out.println("Input is String");
        }
        
        scanner.close();

	}
	public static boolean isBoolean(String str) {
		if(str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
			return true;
		}
		else return false;
	}
	
	
	public static boolean isInteger(String str) {
		try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
		
	}

}
