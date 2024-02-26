package repository;

import java.util.ArrayList;
import java.util.List;

import Entity.Employee;

public interface EmpDao {

	
	public Employee save(Employee emp);
	public List<Employee> findAll();
}
