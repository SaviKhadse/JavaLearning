package com.training.java.day5;

import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		s.push(7);
		s.push(8);
		s.push(9);
		
		System.out.println("Stack items before pop method call:");
		for(Integer item:s) {
			System.out.println(item);
		}
		
		s.pop();
		System.out.println("Stack items after calling pop method once:");
		for(Integer item:s) {
			System.out.println(item);
		}
	}

}
