package com.mockito.example.service;

import java.util.ArrayList;
import java.util.List;

import com.mockito.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private static List<Employee> listEmployee=new ArrayList<Employee>();
	static{
		Employee emp1=new Employee();
		emp1.setName("Ashwani");
		emp1.setAge(28);
		Employee emp2=new Employee();
		emp2.setName("Ramulu");
		emp2.setAge(28);		
		listEmployee.add(emp1);
		listEmployee.add(emp2);
	}
	public List<Employee> employeeList() {		
		return listEmployee;
	}

}
