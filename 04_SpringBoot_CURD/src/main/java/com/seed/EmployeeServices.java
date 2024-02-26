package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepo repo;

	public Employee saveEmployee(Employee Employee) {

		return repo.save(Employee);
	}

	public Employee updateEmployee(Employee Employee) {

		return repo.save(Employee);
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public Optional<Employee> getEmployeeById(Integer id) {
		return repo.findById(id);
	}

//	public Employee getEmployeeByName(String name) {
//		return repo.findByEmployeeName(name);
//	}

	public List<Employee> getEmployees() {
		return repo.findAll();
	}
}
