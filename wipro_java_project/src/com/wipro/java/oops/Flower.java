/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	String name;
	String color;
	int price;
	
	Flower(String name, String color, int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	void display() {
		System.out.println("Flower name:"+name+" Color:"+color+" Price:"+price);
	}
	public static void main(String[] args) {
		Flower flowerobj1 = new Flower("Tulip","white",20);
		Flower flowerobj2 = new Flower("Rose","pink",30);
		flowerobj1.display();
		flowerobj2.display();

	}

}
