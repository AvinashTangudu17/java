/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Ferrari extends Car{

	/**
	 * 
	 */
	public void showdetails() {
		System.out.println("Name of the car: "+getName()+"  Color of the car: "+getColor()+"  Speed of the car: "+getSpeed());
	}
	
	public static void main(String [] args) {
		
		Car ferrariCar = new Ferrari();
		ferrariCar.setName("Ferrari");
		ferrariCar.setColor("Red");
		ferrariCar.setSpeed(225);
		ferrariCar.showdetails();
		
	}
	
	
	public Ferrari() {
		// TODO Auto-generated constructor stub
	}

}
