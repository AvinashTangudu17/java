/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
public class StringApi {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi there we are learning stringapi";
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.substring(1,9));
		System.out.println(str.contains("l"));
		String[] a = str.split(" ");
		for(String str1 : a) {
			System.out.println(str1);
		}

	}

}
