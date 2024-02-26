package Controlar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.Employee;
import Service.service;
import repository.EmpDao;
import repository.EmpDaoImplementation;

@RestController
public class EmployeeControlar {

	@Autowired
	private service Ser;

	@GetMapping(value = "/greet")
	public String greet() {
		return "Hello! Welcome to the class of Rest API";
	}
	
	
	  @GetMapping(value="/emp") public List<Employee> getEmployeesDetails() {
	  return Ser.getAllEmployees(); }
	 

	@GetMapping(value = "/emp/add")
	public Employee addEmployee(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") int salary) {

		Employee emp = new Employee(id, name, salary);

		return Ser.addEmployee(emp);
	}
}
