package Service;

import java.util.List;

import Entity.Employee;

public interface service {

	public Employee addEmployee(Employee emp);

	public List<Employee> getAllEmployees();
}
