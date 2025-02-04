/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Creating a parrot child class of Birds parent class
 */
public class Parrot extends Birds{
	
	void makesSound() {
        System.out.println(getName() + " makes a mimicing sound.");
    }

    void fly() {
        System.out.println(getName() + " is flying!");
    }
    
    public static void main(String [] args) {
    	
    	Birds ParrotBird = new Parrot();
    	ParrotBird.setName("Alice");
    	ParrotBird.setColor("Green");
    	ParrotBird.makesSound();
    	ParrotBird.fly();
    	
    }
	

}
