package com.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ListOfPendingOrderControlar {

	@Autowired
	OrderRepo prodRepo;

	@Autowired
	CustomerRepo custRepo;

	@GetMapping("/getData")

	public ModelAndView getData() {
		ModelAndView mv = new ModelAndView();

		/* List of all product */

		List<Orders> prodList = prodRepo.findAll();
		for (Orders product : prodList) {
			System.out.println(product);
		}

		/* List of All Customers */

		List<CustomerRegistration> custList = custRepo.findAll();
		for (CustomerRegistration customer : custList) {
			System.out.println(customer);
		}
		mv.setViewName("ListOfPendingOrder.jsp");
		mv.addObject("pl", prodList);
		mv.addObject("cl", custList);
		return mv;
	}

	@GetMapping("/getData2")
	public ModelAndView getData2() {
		ModelAndView mv = new ModelAndView();
		List<Orders> prodList = prodRepo.findAll();
		for (Orders product : prodList) {
			System.out.println(product);
		}
		
		List<CustomerRegistration> custList = custRepo.findAll();
		// custname
		
		for (CustomerRegistration customer : custList) {
			System.out.println(customer);
		}
		mv.setViewName("TrackOrder.jsp");
		mv.addObject("pl", prodList);
		mv.addObject("cl", custList);
		return mv;
	}

}
