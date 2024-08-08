package com.training.java.day5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(2);
		ob.add(68);
		ob.add(22);
		ob.add(2);
		ob.add(67);
		ob.add(52);
		
		Iterator<Integer> it=ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println("index of 67="+ob.indexOf(67));
//		System.out.println("number of items in list="+ob.size());
//		System.out.println("the element at the index 2 which is removed="+ob.remove(2));
//		ob.set(1, 100);
//		
//		System.out.println(ob);
		
		
	}

}
