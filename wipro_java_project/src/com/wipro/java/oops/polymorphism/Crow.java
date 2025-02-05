package com.wipro.java.oops.polymorphism;

/**
 * Creating a Crow child class of Birds parent class
 */

public class Crow extends Birds{
	
	void makesSound() {
        System.out.println(getName() + " makes a chirpping sound.");
    }

    void fly() {
        System.out.println(getName() + " is flying!");
    }
    
    public static void main(String [] args) {
    	
    	Birds CrowBird = new Crow();
    	CrowBird.setName("Minni");
    	CrowBird.setColor("black");
    	CrowBird.makesSound();
    	CrowBird.fly();
    	
    }
	

}
