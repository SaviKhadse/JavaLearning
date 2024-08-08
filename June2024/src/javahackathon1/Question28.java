//WJP to find factorial of a number using recursion
package javahackathon1;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int ans = sc.nextInt();
		
		System.out.println("Factorial of number entered is :" + factorial(ans));

	}
	
	static int factorial(int n)
    {
		if (n == 0 || n == 1)
            return 1;
		return n * factorial(n - 1);
    }

}
