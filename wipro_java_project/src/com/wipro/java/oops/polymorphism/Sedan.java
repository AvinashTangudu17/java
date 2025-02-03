/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Sedan extends Car {

	/**
	 * 
	 */
	public void showdetails() {
		System.out.println("Name of the car: "+getName()+"  Color of the car: "+getColor()+"  Speed of the car: "+getSpeed());
	}
	
	public static void main(String [] args) {
		
		Car sedanCar = new Sedan();
		sedanCar.setName("Sedan");
		sedanCar.setColor("Black");
		sedanCar.setSpeed(125);
		sedanCar.showdetails();
		
	}
	public Sedan() {
		// TODO Auto-generated constructor stub
	}

}
