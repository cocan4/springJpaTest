package com.springtest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.beans.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	public List<Employee>findByName(String name);
	
}
