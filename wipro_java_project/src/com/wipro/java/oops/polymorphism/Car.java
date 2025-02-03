/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 *  Demonstrating Polymorphism in java 
 */
public class Car {

	/**
	 * 
	 */
	private String name;
	private String color;
	private int speed;
	
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

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void showdetails() {
		System.out.println("Name of the car: "+name+"Color of the car: "+color+"Speed of the car: "+speed);
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

}
