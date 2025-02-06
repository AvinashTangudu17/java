package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
class Year implements Comparator<Movie1> {
	 public int compare(Movie1 m1, Movie1 m2) {
			// TODO Auto-generated method stub
		 
			return Integer.compare(m2.getYear(), m1.getYear());
			
	 }

	public static void main(String[] args) {
		
		// Create a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("RRR" ,9.5, 2022));
		m1.add(new Movie1("Pushpa" ,9.3, 2020));
		m1.add(new Movie1("Raayan" ,9.1, 2024));
		
		//Sort movies bt name and display all
		Collections.sort(m1, new Year());
		System.out.println("\nMovies sorted by Year:");
		for(Movie1 m : m1) {
			System.out.println(m.getYear()+" "+m.getName()+" "+m.getRating());
		}
		
		
		

	}

	
	

}

