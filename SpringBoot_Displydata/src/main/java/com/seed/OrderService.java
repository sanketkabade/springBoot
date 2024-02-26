package com.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepo orepe;
	
	public OrderData saveOrder(OrderData order) {
		return orepe.save(order);
		
	}	

	public List<OrderData> displayOrder () {
		return orepe.findAll();
		
	}
}
