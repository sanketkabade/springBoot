package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Entity.Employee;

public class EmpDaoImplementation implements EmpDao {

	public static List<Employee> emp = new ArrayList<Employee>();
	
	

	static {
		emp.add(new Employee(1, "Jack", 5000));
		emp.add(new Employee(2, "Sam", 51000));
		emp.add(new Employee(3, "Jackie", 50000));
		emp.add(new Employee(4, "Jackson", 35000));
		emp.add(new Employee(5, "Jack sparrow", 15000));
	}

	@Override
	public Employee save(Employee empl) {

		emp.add(empl);
		return empl;
	}

	@Override
	public List<Employee> findAll() {
		
		Iterator<Employee> itr = emp.iterator();
		return emp;
	}

}
