//write a program to find factorial (Non Recursive)

package javahackathon1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int input= sc.nextInt();
		
		if(input==0 || input==1) {
			System.out.println("Factorial is :"+ input);
		}else {
			for(int i=1; i<=input;i++) {
				fact *=i;
			}
			System.out.println("Factorial is :"+fact);
		}

	}

}
