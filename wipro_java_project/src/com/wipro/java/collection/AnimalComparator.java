package com.wipro.java.collection;
/**
 * 
 */

class AnimalComparator {
	private String n;
	private int a;
	
	public AnimalComparator(String n, int a) {
		this.n = n;
		this.a = a;
	}
	
	//Getter methods
	public String getName() {
		return n;
	}
	public int getAge() {
		return a;
	}
}
