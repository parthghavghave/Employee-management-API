package com.accenture.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.model.Employee;
import com.accenture.repository.EmployeeRepo;
import com.accenture.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		Employee emp = employeeRepo.save(employee);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {

		employeeRepo.deleteById(id);
		return "Data deleated Successfully";
	}

	@Override
	public Optional<Employee> findEmpById(int id) {

		Optional<Employee> emp = employeeRepo.findById(id);
		if(emp.isPresent()) {
			return emp;
		}
		else {
			return null;
		}
		
	}

	@Override
	public String updateEmployee(int id, Employee employee) {

		Optional<Employee> emp = employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			Employee emps = employee;
			employeeRepo.save(emps);
			return "Updated Successfully"; 
		}
		else {
			return "Employee not Found";
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> empList = employeeRepo.findAll();
		return empList;
	}

}
