package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Entity.Employee;
import repository.EmpDaoImplementation;

@Component
public class ServiceImplementation implements service {

	@Autowired
	private EmpDaoImplementation empDaoImplementation;
	
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return empDaoImplementation.save(emp);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return empDaoImplementation.findAll();
	}

}
