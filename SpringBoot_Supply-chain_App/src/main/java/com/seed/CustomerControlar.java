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
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class CustomerControlar {
	@Autowired
	CustomerService cservice;

	@PostMapping("/addCust")
	public CustomerRegistration saveEmployee(@RequestBody CustomerRegistration cregister) {
		return cservice.saveCustomer(cregister);

	}

	@GetMapping("/CustomerRegistration")
	public String CustomerRegistration(HttpServletRequest req) {

		CustomerRegistration customer = new CustomerRegistration();

		customer.setOrganizationName(req.getParameter("orgName"));
		
		customer.setContactPerson(req.getParameter("pname"));
		
		customer.setContact(req.getParameter("ContactP"));
		
		customer.setOfficialEmail(req.getParameter("OffEmail"));	
		

		cservice.saveCustomer(customer);
		System.out.println("hello from CustomerController");
		return "welcome.jsp";
	}

	@PutMapping("/updateCust")
	public CustomerRegistration updateEmployee(@RequestBody CustomerRegistration cregister) {
		return cservice.saveCustomer(cregister);
	}

	@DeleteMapping("/deleteCustomer/{id}")

	public void deleteDelarById(@PathVariable Integer id) {
		cservice.deleteCustByID(id);
	}

	@GetMapping("/selectCustById/{id}")
	public Optional<CustomerRegistration> getDelarById(@PathVariable Integer id) {
		return cservice.getCustById(id);
	}

	@GetMapping("/allCustomer")
	public List<CustomerRegistration> getDelar() {
		return cservice.getCustomer();

	}
}
