package com.practice.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/new")
public class ProductsController {
	@Autowired
	private ProductsService proService;
	
	@PostMapping("/save")
	public void save(@RequestParam String productName, @RequestParam double price) {
		proService.saveProduct(productName, price);
		
	}
	@GetMapping("/all")
	public List<Products> getAll() {
	    return proService.getAllProducts();
	}


}
