package service;

import Entity.Employee;
import repository.EmployeeRepository;

public class EmployeeServiceImplementation implements EmployeeServices {

	 EmployeeRepository emprepo;
	@Override
	public Employee AddEmp(Employee employee) {
			
		return emprepo.save(employee);
	}

}
