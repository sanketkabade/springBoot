package com.seed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import com.seed.ProductRpository.ProductRepository;

//import com.seed.Repository.ProductRpository.ProductRepository;

//import com.seed.Entity.product;
//import com.seed.Repository.ProductRpository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRpository repo;

	public Product saveProduct(Product product) {

		return repo.save(product);
	}

	public Product updateProduct(Product product) {

		return repo.save(product);
	}
	  public void deleteById(Integer prodId) {
		  repo.deleteById(prodId);
	    }
	  
	  public Optional<Product> getProductById(Integer prodId) {
		  return repo.findById(prodId);
	  }
	  
	  public Product getProductByName(String prodName) {
		  return repo.findByProdName(prodName);
	  }
	  
	  
	  public List<Product> getProducts(){
		return repo.findAll();
		  
	  }
}
