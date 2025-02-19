package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		// Create a HashMap to store roll numbers as keys and names as values
		Map<Integer, String> studentMap = new HashMap<>();

		// Add 10 students to the HashMap
		studentMap.put(111, "John");
		studentMap.put(222, "Miller");
		studentMap.put(333, "Charlie");
		studentMap.put(444, "Alice"); 
		studentMap.put(555, "Davidson");
		studentMap.put(111, "John");  // Duplicate name and id
		studentMap.put(777, "Alice"); 
		studentMap.put(888, "Frank");
		studentMap.put(999, "Grace");
		studentMap.put(222, "Davidson");  // Duplicate name

		// Print all students in the HashMap
		System.out.println("Student Roll Numbers and Names:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("Roll Number: " + entry.getKey() + ", Name: "
					+ entry.getValue());
		}

		// Example: Retrieve a student's name by roll number
		int rollNumberToFind = 111;
		if (studentMap.containsKey(rollNumberToFind)) {
			System.out.println("\nStudent with Roll Number " + rollNumberToFind
					+ " is: " + studentMap.get(rollNumberToFind));
		} else {
			System.out.println("\nStudent with Roll Number " + rollNumberToFind
					+ " not found.");
		}
	}
}