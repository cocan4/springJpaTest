package com.springtest.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.beans.Employee;
import com.springtest.beans.Job;
import com.springtest.repo.EmployeeRepo;
import com.springtest.repo.JobRepo;

@Service
public class CompanyService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private JobRepo jobRepo;

	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);

	}

	public Employee getOneEmployee(Long employeeID) {
		return employeeRepo.getOne(employeeID);
	}

	public List<Employee> getEmployeeByName(String name) {
		return employeeRepo.findByName(name);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public List<Job> getAllJobs() {
		return jobRepo.findAll();
	}

	public List<Job> getJobsByEndDate(Date endDate) {
		return jobRepo.findByEndDate(endDate);
	}

	public List<Job> getJobsBetweenDates(Date startDate, Date endDate) {
		return jobRepo.findByEndDateBetween(startDate, endDate);

	}

}
