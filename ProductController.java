package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.entity.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	
	@PostMapping//Create
	public Boolean addProducts(@RequestBody Product product) {
		productRepo.save(product);
		return Boolean.TRUE;
	}
	
	@GetMapping//Read
	public List<Product> getProducts()
	{
		return productRepo.findAll();
	}
	
	@GetMapping("/{id}")//ReadById
	public Product getProductById(@PathVariable int id) {
		return productRepo.findById(id).get();
		
	}
	
	@PutMapping("/{Id}")//Update
	public Product updateProduct(@PathVariable int Id,@RequestBody Product updatedProduct) {
		Product product = productRepo.findById(Id).get();
		product.setName(updatedProduct.getName());
		product.setPrice(updatedProduct.getPrice());
		product.setCategory(updatedProduct.getCategory());
		return productRepo.save(product);
	}
	
	@DeleteMapping("/{Id}")//Delete
	public Boolean deleteProduct(@PathVariable int Id) {
		productRepo.deleteById(Id);
		return Boolean.TRUE;
	}

}
