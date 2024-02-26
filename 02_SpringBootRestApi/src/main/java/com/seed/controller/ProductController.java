//package com.seed.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.seed.Entity.product1;
//
//import com.seed.service.ProductService;
//
//public class ProductController {
//	@Autowired
//	ProductService service;
//	@PostMapping("/addproduct")
//	@ResponseBody
//	public product1 saveProduct(@RequestBody product1 product) {
//		return service.saveProduct(product);
//	}
//}
