/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent class - Employee
 * Child class - ProjectLead
 * extends - keyword
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String [] args) {
    	
  // The child object is intantiated from child constructor
  // Parent class consumes the properties and behavior of child class
    	
    	 //  	Employee employee = (Employee) new ProjectLead();
    	
    	Employee employee = new ProjectLead();
    	employee.setId(100);
    	employee.setName("Avi");
    	employee.setSalary(30000f);
    	
    	
    	
    	System.out.println(employee.getId());
    	System.out.println(employee.getName());
    	System.out.println(employee.getSalary());

    }
}
