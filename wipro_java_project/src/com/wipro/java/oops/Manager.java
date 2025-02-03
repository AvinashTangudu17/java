package com.wipro.java.oops;

/**
 * Parent class - Employee
 * Child class - Manager
 * extends - keyword
 */
public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
    	
		  // The child object is intantiated from child constructor
		  // Parent class consumes the properties and behavior of child class
		    	
		    	
		    //	Employee employee = (Employee) new Manager();
		
		    	Employee employee1 = new Manager();
		    	employee1.setId(200);
		    	employee1.setName("John");
		    	employee1.setSalary(10000f);
		    	
		    	
		    	
		    	System.out.println(employee1.getId());
		    	System.out.println(employee1.getName());
		    	System.out.println(employee1.getSalary());

		    }
}
