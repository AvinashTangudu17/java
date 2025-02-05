/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		
		//List is a class in java collections there are inside the util package.
		//Creating an object
		
		List<Integer> l1 = new ArrayList<>();
		
		//Addding elements to list 1
		
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		
		l1.add(4);
		l1.add(5);
		
		//it is used to get size of the list
		System.out.println(l1.size());
		
		
		List<Integer> l2 = new ArrayList<>();
		
		//Adding elements to list 2
		
		l2.add(5);
		l2.add(6);
		l2.add(7);
	
		l1.addAll(l2);
		
		System.out.println(l1.size());
		System.out.println(l1.remove(7));
		
		l1.set(6, 60);
		System.out.println(l1.get(6));
		
	}
}