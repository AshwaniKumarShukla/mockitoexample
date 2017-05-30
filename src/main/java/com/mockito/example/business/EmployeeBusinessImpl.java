package com.mockito.example.business;

import java.util.List;

import com.mockito.example.model.Employee;
import com.mockito.example.service.EmployeeService;

public class EmployeeBusinessImpl {
	private EmployeeService employeeService;
	public EmployeeBusinessImpl(EmployeeService employeeService){
		super();
		this.employeeService=employeeService;
	}
	
	public List<Employee> filteremployeeList() {
		return employeeService.employeeList();
	}
}
