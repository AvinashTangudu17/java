package com.wipro.java.usecase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Optional;

public class EmployeeServiceTest {

    @Test
    public void testAddEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(emp);

        Optional<Employee> result = service.searchEmployee(1);
        assertEquals(true, result.isPresent());
    }

    @Test
    public void testRemoveEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(emp);
        service.removeEmployee(1);

        Optional<Employee> result = service.searchEmployee(1);
        assertEquals(false, result.isPresent());
    }

    @Test
    public void testSearchEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(emp);

        Optional<Employee> result = service.searchEmployee(1);
        assertEquals("Alice", result.get().getEmpName());
    }
    
    @Test
    public void testUpdateSalary() {
    	EmployeeService service = new EmployeeService();
    	Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
    	service.addEmployee(emp); service.updateSalary(1, 60000);
    	
    	Optional<Employee> result = service.searchEmployee(1);
    	assertEquals(60000,result.get().getSalary(),0.01);
    }
}

	
	  
	 



