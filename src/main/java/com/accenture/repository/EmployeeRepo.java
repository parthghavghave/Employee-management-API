package com.accenture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
