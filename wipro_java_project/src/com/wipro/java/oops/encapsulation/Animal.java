/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
	
	private String name;
	private int weight;
	
	
	public Animal(String name, int weight) {
		super(); // Calls the root parent class object
		this.name = name;
		this.weight = weight;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getWeight() {
		return weight;
	}


	/**
	 * @param age the age to set
	 */
	public void setWeight(int weight) {
		
		if(weight > 5 && weight < 25) {

		this.weight=weight;

		}

		else {

		System.out.println("Weight must be appropriate");

		}

		
	}
	
	public static void main(String [] args) {
		
		Animal a1 = new Animal("Cat",10);
		System.out.println(a1.getName());
		System.out.println(a1.getWeight());
		
		a1.setWeight(15);
		System.out.println(a1.getName());
		System.out.println(a1.getWeight());
		
		a1.setWeight(4);
		
	}

}
