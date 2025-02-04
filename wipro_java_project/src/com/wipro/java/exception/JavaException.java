/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class JavaException {

	/**
	 * It is accesible by all the instances of a class.
	 * memory of storage is allocated once and remains unless it is empty
	 */
	
	static int i=5;
	public static void main(String[] args) {
		
		int num1 = 20, num2 = 0, data;
		try {
			//data =i/j gives some unusual values 
			
			data = num1/num2; //This is exception
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Code to be executed");
		}
		System.out.println("Rest of the code");

	}

}
