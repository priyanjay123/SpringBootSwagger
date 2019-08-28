package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerAPIController {
	@GetMapping(value = "/products")
	public List<String> getProducts() {
		List<String> productsList = new ArrayList<>();
		productsList.add("Honey");
		productsList.add("Almond");
		return productsList;
	}

	@PostMapping(value = "/products")
	public String createProduct() {
		return "Product is saved successfully";
	}
}
