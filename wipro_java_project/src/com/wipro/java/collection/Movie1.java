/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */


 class Movie1 {
	 private String n; //movie name
	 private double r; //movie rating
	 private int y; //release year of the movie
	 
	 //Constructor to initiate movie details
	 public Movie1(String n, double r, int y) {
			super();
			this.n = n;
			this.r = r;
			this.y = y;
		}

	/**
	 * Getter Methods
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

}
