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
public class OrderControlar {

	@Autowired
	public OrderService service;

	@PostMapping("/addOrder")
	public Orders saveOrder(@RequestBody Orders orders) {
		return service.saveOrder(orders);
	}

	@GetMapping("/orders")
	public String Orders(HttpServletRequest req) {
		Orders orders = new Orders();
		orders.setProdId(req.getParameter("pId"));
		orders.setProdName(req.getParameter("product"));
		orders.setProdQntity(req.getParameter("qnt"));
		orders.setDeleveryAddress(req.getParameter("Address"));
		service.saveOrder(orders);
		System.out.println("hello from delerController");
		
		return "welcome.jsp";

	}

	@PutMapping("/updateOrder")
	public Orders updateOrder(@RequestBody Orders orders) {
		return service.UpdateOrder(orders);
	}

	@DeleteMapping("deleteOrder/{id}")

	public void deleteOrder(@PathVariable Integer id) {

		service.deleteOrder(id);
	}

	@GetMapping("/orderById/{id}")
	public Optional<Orders> getOrderById(@PathVariable Integer Id) {
		return service.getOrderById(Id);
	}

	@GetMapping("/allOrder")
	public List<Orders> getAllorders() {
		return service.getAllOrder();

	}

}
