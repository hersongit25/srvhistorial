package com.mdm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	ProductService productService;
	
	public OrderService(ProductService productService) {
		this.productService = productService;
		System.out.println("Constructor OrderService");
	}

	public String getProductName() {
		return productService.getProductName();
	}
}
