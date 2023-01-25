package com.jpa.demo.serviceImplemenataion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.Entity.Employee;
import com.jpa.demo.repository.EmployeeRepository;
import com.jpa.demo.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployes() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployees(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findByDept(String dept) {
		// TODO Auto-generated method stub
		return employeeRepository.findByDept(dept);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findall();
	}

	@Override
	public Integer delete(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteByName(name);
	}

	

//	@Override
//	public int updateEmployeeState(boolean active,List<Integer> id) {
//		// TODO Auto-generated method stub
//		return employeeRepository.updateEmployeeStatusByEmployeeId(active, id);
//	}

//	@Override
//	public List<Employee> findByActive(boolean active) {
//		// TODO Auto-generated method stub
//		return employeeRepository.findByActive(active);
//	}
	
//	@Override
//	public List<Employee> findByDept(String dept) {
//		// TODO Auto-generated method stub
//		return employeeRepository.searchByDept(dept); 
//	}


	
} 
