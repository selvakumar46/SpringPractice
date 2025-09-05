package com.practice.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository proRepo;
	
	
	public void saveProduct(String productName, double productPrice) {
		
		Products products = new Products();
		products.setProduct_name(productName);
		products.setProduct_price(productPrice);
		proRepo.save(products);
	}
	
	public List<Products> getAllProducts() {
	    return proRepo.findAll();
	}

}
