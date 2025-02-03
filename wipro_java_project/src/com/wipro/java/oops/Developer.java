/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class - Employee
 * Child class - Developer
 * extends - keyword
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
    	
		  // The child object is intantiated from child constructor
		  // Parent class consumes the properties and behavior of child class
		    	
		    	
		  //  	Employee employee = (Employee) new Developer();
		
		    	Employee employee2 = new Developer();
		    	employee2.setId(300);
		    	employee2.setName("Peter");
		    	employee2.setSalary(20000f);
		    	
		    	
		    	
		    	System.out.println(employee2.getId());
		    	System.out.println(employee2.getName());
		    	System.out.println(employee2.getSalary());

		    }
}
