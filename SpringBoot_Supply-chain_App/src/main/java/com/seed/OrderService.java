package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;

	public Orders saveOrder(Orders or) {

		return orderRepo.save(or);
	}

	public Orders UpdateOrder(Orders or) {

		return orderRepo.save(or);
	}

	public void deleteOrder(int id) {
		orderRepo.deleteById(id);
	}

	public Optional<Orders> getOrderById(Integer id) {

		return orderRepo.findById(id);
	}

	public List<Orders> getAllOrder() {
		return orderRepo.findAll();
	}
}
