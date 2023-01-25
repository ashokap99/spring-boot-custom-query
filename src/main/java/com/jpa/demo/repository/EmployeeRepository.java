package com.jpa.demo.repository;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.jpa.demo.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//@Query("SELECT emp FROM Employee emp")
	public List<Employee> findByDept(String dept);
	
//	@Query("select emp from customquery.employee_detials emp where emp.active=:a")
//	public List<Employee> findByActive(@Param("a") boolean active);
//	
//	
	
//	@Modifying
//	@Query("update Employee emp set emp.active= ?1 where emp.id in ?2")
//	int updateEmployeeStatusByEmployeeId(boolean active, List<Integer> id);  
//	
	 @Query(value = "SELECT * FROM customquery.employee_detials", nativeQuery = true) 
	 List<Employee> findall();
	 
	 @Transactional
	 @Modifying
	 @Query("DELETE FROM employee_detials WHERE emp_name = ?1")
	 Integer deleteByName(String name);
}



