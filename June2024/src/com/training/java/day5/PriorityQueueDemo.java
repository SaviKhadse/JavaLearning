package com.training.java.day5;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> ps = new PriorityQueue<Integer>();
		
		ps.add(76);
		ps.add(18);
		ps.add(93);
		
		for(Integer item:ps) {
			System.out.println(item);
		}
		
		System.out.println("element removed="+ps.remove());
		for(Integer item:ps) {
			System.out.println(item);
		}
		

	}

}
