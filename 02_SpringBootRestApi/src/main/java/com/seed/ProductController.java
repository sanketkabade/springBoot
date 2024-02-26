package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.seed.Entity.product;
//
//import com.seed.service.ProductService;
@Controller
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/addProduct")
	@ResponseBody
	public Product saveProduct(@RequestBody Product Product) {
		return service.saveProduct(Product);
	}
	
	@PutMapping("/updateProduct")
	@ResponseBody
	public Product updateProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	  @DeleteMapping("/deleteProduct/{prodId}")
	  @ResponseBody
	    public void deleteEntityById( @PathVariable Integer prodId) {
	        service.deleteById(prodId);
	    }
	  @GetMapping("/selectById/{prodId}")
	  public Optional<Product> getProductById(@PathVariable Integer prodId) {
		  return service.getProductById(prodId);
	  }
	  @GetMapping("/allProduct")
	  public List<Product> getProducts(){
			return service.getProducts();
			  
		  }
	   @GetMapping("/getProd/{prodName}")
	  public Product getProductByName(@PathVariable  String prodName) {
		  return service.getProductByName(prodName);
	  }
}
