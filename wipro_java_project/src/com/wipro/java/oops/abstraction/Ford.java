/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Ford extends Car{

	
	//Class implementing the abstract methods
	
	@Override
	void color() {
		// Determines the color of the car
		System.out.println("The color is White");
	}
	@Override
	void model() {
		// Determines the model of the car
		System.out.println("The model is FD543");
		
		
	}
	

}
