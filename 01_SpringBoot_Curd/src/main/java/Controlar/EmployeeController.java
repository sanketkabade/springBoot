package Controlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Entity.Employee;
import service.EmployeeServices;

public class EmployeeController {

	@Autowired
	private EmployeeServices empService;
	
	@GetMapping(value = "/greet")
	public String greet() {
		return "Hello! Welcome to the class of Rest API";
	}
	
	@GetMapping(value =" /emp/add")
	public Employee addEmp(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("salary") double salary,
			@RequestParam("department") String dept) {
		
		     Employee emp = new Employee(id, name, salary, dept);
				return empService.AddEmp(emp);
				}
			
			
			
}
