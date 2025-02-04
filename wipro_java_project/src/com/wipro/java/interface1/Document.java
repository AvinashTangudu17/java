package com.wipro.java.interface1;

public class Document implements Showable , Printable{
	public void print() {
		System.out.println("Print");
		
	}
	
	public void show() {
		System.out.println("Show");
	}

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		doc1.show();
		doc1.print();

	}

}
