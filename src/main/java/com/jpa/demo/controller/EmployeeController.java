package com.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jpa.demo.Entity.Employee;
import com.jpa.demo.repository.EmployeeRepository;
import com.jpa.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
   private	EmployeeService employeeService;
	@Autowired
   private EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/getAllEmployee")
	public ResponseEntity getAllEmployes() {
		return new ResponseEntity (employeeService.getAllEmployes(),HttpStatus.ACCEPTED);
	}
	@PostMapping(value = "/save")
	public ResponseEntity saveEmployees(@RequestBody Employee employee) {
		return new ResponseEntity(employeeService.saveEmployees(employee),HttpStatus.CREATED);
	}
	@GetMapping(value = "/findByDept/{dept}")
	public ResponseEntity findByDept(@PathVariable String dept) {
		return new ResponseEntity<>(employeeService.findByDept(dept),HttpStatus.ACCEPTED);
	}
	@DeleteMapping(value = "delete/{name}")
	public Integer delete(@PathVariable String name) { 
		 return employeeRepository.deleteByName(name);
		 }
	
//	@GetMapping(value = "/findByDept/{dept}")
//	public ResponseEntity<List<Employee>> findByDept(@PathVariable String dept) {
//		return new ResponseEntity<List<Employee>> (employeeService.findByDept(dept),HttpStatus.OK);
//	}
//	@PutMapping("/updateEmployeeState/{activeState}/{empId}")
//	public ResponseEntity updateEmployeeState(@PathVariable boolean active,
//			@PathVariable List<Integer> id) {
//		return new ResponseEntity (employeeService. updateEmployeeState(active,id),HttpStatus.OK);
//	}
	
	@GetMapping("/getAll")
	 public List<Employee> getAll() { 
		 return employeeRepository.findall(); 
		 }

}
