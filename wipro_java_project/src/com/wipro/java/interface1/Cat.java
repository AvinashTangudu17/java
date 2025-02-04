package com.wipro.java.interface1;
/**
 * 
 */

public class Cat implements Animal {
	
	public void makeSound() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat1 = new Cat();
		cat1.makeSound();
		

	}

}