package com.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControlar {
	@Autowired
	OrderService oservice;
	
	@PostMapping("/addOrder")
	public OrderData saveOrder(@RequestBody OrderData order){
		
		return oservice.saveOrder(order);
	}
	
	@GetMapping("/display")
	
	public List<OrderData> display(){
		return oservice.displayOrder();
	}
	
	

}
