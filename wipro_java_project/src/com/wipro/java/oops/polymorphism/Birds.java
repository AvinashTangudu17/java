/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Creating a Birds parent class
 */
public class Birds {
	
	private String name;
    private String color;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	void makesSound() {
        System.out.println(name + " makes a generic bird sound.");
    }

    void fly() {
        System.out.println(name + " is flying!");
    }

}
