package com.tekarch.day2;

public class Array2D {

	public static void main(String[] args) {
		int a[][] = {{11,22,33}, {33,22,11}};
		int b[][] = {{33,22,11},{11,22,33}};
		int c [][] = new int[2][3];
		
//		Printing array a
		System.out.println("Array -a:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
//		printing Array b
		System.out.println("Array -b:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" "+ b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of Array a and Array b:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" " +c[i][j]);
			}
		System.out.println();
	}

}
}
