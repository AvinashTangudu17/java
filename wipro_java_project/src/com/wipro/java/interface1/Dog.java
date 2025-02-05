/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Dog implements Animal {
	
	public void makeSound() {
		System.out.println("Bark");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog1 = new Dog();
		dog1.makeSound();
		

	}

}
