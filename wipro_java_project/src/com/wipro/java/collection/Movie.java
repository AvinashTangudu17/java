package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;


//Movie class implements comparable
//interface to define default sorting

public class Movie implements Comparable<Movie> {
	
	private String n; //movie name
	private double r; //movie rating
	private int y; //release year of the movie

	public Movie(String n, double r, int y) {
		super();
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	//Implementation of the compareTO method
	//for default sorting by year
	public int compareTo(Movie m) {
		
		//Sort movies in ascending order of year
		
		return this.y - m.y;
	}
	/**
	 * Getter and setter Methods
	 */
	public String getName() {
		return n;
	}

	
	public double getRating() {
		return r;
	}


	public int getYear() {
		return y;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create list of movies
		
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie("Star Wars", 8.5,1977));
		l.add(new Movie("Empire Strikes Back", 8.8,1980));
		l.add(new Movie("Return of the Jedi", 8.4,1983));
		
		Collections.sort(l);
		
		System.out.println("Movies after sorting by year:");
		for(Movie m : l) {
			System.out.println(m.getName() +" "+m.getRating() +" "+m.getYear());
		}

	}

}

