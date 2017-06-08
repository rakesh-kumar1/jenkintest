package com.tcs.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testGetEmployeeName(){
		Employee emp = new Employee();
		String empName  = emp.getEmployeeName();
		assertEquals(empName, "Rakesh");
	}
	
}
