package com.mockito.example.business;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;





import com.mockito.example.business.EmployeeBusinessImpl;
import com.mockito.example.model.Employee;
import com.mockito.example.service.EmployeeService;

import static org.mockito.Mockito.*;


public class EmployeeBusinessImplTest {

	@Test
	public void employeeList_UsingMock() {
		List<Employee> listEmployees=new ArrayList<Employee>();
		Employee emp1=new Employee();
		emp1.setName("sravya");
		emp1.setAge(28);
		Employee emp2=new Employee();
		emp2.setName("Ramulu");
		emp2.setAge(28);
		listEmployees.add(emp1);
		listEmployees.add(emp2);
		EmployeeService empService=mock(EmployeeService.class);
		when(empService.employeeList()).thenReturn(listEmployees);
		EmployeeBusinessImpl businessImpl=new EmployeeBusinessImpl(empService);
		assertEquals("sravya", businessImpl.filteremployeeList().get(0).getName());		
		
	}
	
	@Test
	public void employeeEmptyList_UsingMock() {
		List<Employee> listEmployees=new ArrayList<Employee>();		
		EmployeeService empService=mock(EmployeeService.class);
		when(empService.employeeList()).thenReturn(listEmployees);
		EmployeeBusinessImpl businessImpl=new EmployeeBusinessImpl(empService);
		assertEquals(0, businessImpl.filteremployeeList().size());		
		
	}

	@Test(expected=Exception.class)
	public void employeeListException_UsingMock() {	
		EmployeeService empService=mock(EmployeeService.class);
		when(empService.employeeList()).thenThrow(new Exception());
		
	}

}
