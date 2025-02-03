/**
 * 
 */
package com.wipro.java.oops;

/** Properties for POJO class
 * No constructors 
 * getters have a return value
 * setters have no return value
 * properties are determined using private fields
 * values or behaviors are determined through setters
 * toString() will convert the entire animal class with properties and behaviors
 * 
 */
public class Animal {

	/**
	 * 
	 */
	
	private String name;
	private String species;
	private int age;
    private float weight;
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
