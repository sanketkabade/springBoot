package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControlar {
	@Autowired
	EmployeeServices service;

	@PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee Employee) {
		return service.saveEmployee(Employee);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee Employee) {
		return service.saveEmployee(Employee);
	}

	@DeleteMapping("/deleteEmployee/{prodId}")

	public void deleteEntityById(@PathVariable Integer prodId) {
		service.deleteById(prodId);
	}

	@GetMapping("/selectById/{prodId}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer prodId) {
		return service.getEmployeeById(prodId);
	}

	@GetMapping("/allEmployee")
	public List<Employee> getEmployees() {
		return service.getEmployees();

	}

//	@GetMapping("/getEmp/{name}")
//	public Employee getEmployeeByName(@PathVariable String name) {
//		return service.getEmployeeByName(name);
//	}

}
