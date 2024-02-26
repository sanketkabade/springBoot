package com.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
@Repository


	public interface ProductRpository extends JpaRepository<Product,Integer>{
		
	public Product findByProdName(String  prodName);
	}

