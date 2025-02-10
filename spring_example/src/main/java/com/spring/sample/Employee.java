package com.spring.sample;

public class Employee {
	
	private int id;
	private String name;
	private String city;
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}  
	
	void display(){  

	    System.out.println(id+" "+name+" "+city);  

	}

}
