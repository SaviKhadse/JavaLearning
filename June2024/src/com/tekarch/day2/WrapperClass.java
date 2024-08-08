package com.tekarch.day2;

public class WrapperClass {

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		
		Integer j= new Integer(10);
		Integer l = 50;
		System.out.println(Integer.compare(j, l));
		
		Integer test= new Integer(i);
		System.out.println(test.floatValue());
		
		//process of converting primitive data type 
		//wrapper class is boxing
		
		int primitive = l;
		System.out.println(primitive);

	}

}
