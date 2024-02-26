package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepo crepo;
	
	public CustomerRegistration saveCustomer(CustomerRegistration cregister) {
		return crepo.save(cregister);
	}
	
	public CustomerRegistration UpdateCust(CustomerRegistration cupdate) {
		return crepo.save(cupdate);
	}
	
	public void deleteCustByID (Integer id) {
		crepo.deleteById(id);
	}
	
	public Optional<CustomerRegistration> getCustById(Integer id){
		return crepo.findById(id);
		
	}
	public List<CustomerRegistration> getCustomer() {
		return crepo.findAll();
	}
}
