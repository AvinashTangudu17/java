package com.wipro.java.usecase;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService 
{
	private List<Employee> employees = new ArrayList<Employee>();
	
	/*
	 * Add an employee
	 */
	public void addEmployee(Employee emp)
	{
		employees.add(emp);
		System.out.println("Employee added succesfully : "+emp);
	}
	
	
	/*
	 * Remove an Employee by ID
	 */
	
	public void removeEmployee(int id)
	{
		employees.removeIf(e -> e.getEmpId()==id);
		System.out.println("Employee with id : "+id+" removed successfully");
	}
	
	
	/*
	 * Search an Employee using ID
	 */
	
	public Optional<Employee> searchEmployee(int id)
	{
		return employees.stream().filter(e->e.getEmpId()==id).findFirst();
	}
	
	
	
	/*
	 * Update Employee Salary
	 */
	
	public void updateSalary(int id , double newSalary)
	{
		employees.stream().filter(e->e.getEmpId()==id).findFirst().ifPresent(e->e.setSalary(newSalary));
	}
	
	
	/*
	 * Display all the employees
	 */
	
	public void displayEmployees()
	{
		employees.forEach(System.out::println);
	}
	
	
	/*
	 * Filter employees by Department
	 */
	
	public List<Employee> filterByDepartment(String dept)
	{
		return employees.stream().filter(e->e.getDepartment().equalsIgnoreCase(dept)).collect(Collectors.toList());
	}
	
	
	/*
	 * Sort employees by names
	 */
	
	public List<Employee> sortByName()
	{
		return employees.stream().sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).collect(Collectors.toList());
	}
	
	
	/*
	 * Get average salary
	 */
	
	public double getAverageSalary()
	{
		return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
	}
}
	
