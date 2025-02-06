package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
class AgeAnimal implements Comparator<AnimalComparator> {
	 public int compare(AnimalComparator a1, AnimalComparator a2) {
			// TODO Auto-generated method stub
		 
			return Integer.compare(a2.getAge(), a1.getAge());
			
	 }

	public static void main(String[] args) {
		
		// Create a list of movies
		ArrayList<AnimalComparator> a1 = new ArrayList<>();
		a1.add(new AnimalComparator("Tiger" ,15));
		a1.add(new AnimalComparator("Dog" ,9));
		a1.add(new AnimalComparator("Cat" ,7));
		
		//Sort movies bt name and display all
		Collections.sort(a1, new AgeAnimal());
		System.out.println("\nAnimal sorted by age:");
		for(AnimalComparator a : a1) {
			System.out.println(a.getAge());
		}
		
		
		

	}

	
	

}

