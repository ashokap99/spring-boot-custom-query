package com.jpa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.jpa.demo.Entity.Employee;

@Service
public interface EmployeeService {
	 List <Employee> getAllEmployes();
	Employee saveEmployees(Employee employee);
	 List<Employee> findByDept(String dept);
	 Integer delete(String name);
	// List<Employee> findByActive(boolean active);
	 // public int  updateEmployeeState(boolean active,List<Integer> id);
	 List<Employee> getAll();	
}
