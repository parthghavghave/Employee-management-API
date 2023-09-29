package com.accenture.service;

import java.util.List;
import java.util.Optional;

import com.accenture.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee> findEmpById(int id);
	
	public String updateEmployee(int id, Employee employee);
	
	public List<Employee> getAllEmployee();
	
}
