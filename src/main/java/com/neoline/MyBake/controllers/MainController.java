package com.neoline.MyBake.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoline.MyBake.entitys.Product;
import com.neoline.MyBake.entitys.repo.ProductRepo;

@RestController
public class MainController {
	
	
	@Autowired
	ProductRepo productRepo;
	
	
	@GetMapping("/products")
	public List<Product> main()
	{
		return productRepo.findAll();
	}
	

}
