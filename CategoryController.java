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

import com.example.demo.Repository.CategoryRepo;
import com.example.demo.entity.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@PostMapping////Create
	public Boolean addCategory(@RequestBody Category category) {
		try{
			categoryRepo.save(category);
			return Boolean.TRUE;
		}
		catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
	
	@GetMapping//Read
	public List<Category> getCategories()
	{
		return categoryRepo.findAll();
	}
	
	@GetMapping("/{id}")//ReadById
	public Category getCategoryById(@PathVariable int id) {
		return categoryRepo.findById(id).get();
		
	}
	
	@PutMapping("/{Id}")//Update
	public Category updateCategory(@PathVariable int Id,@RequestBody Category updatedCategory) {
		Category category = categoryRepo.findById(Id).get();
		category.setName(updatedCategory.getName());
		return categoryRepo.save(category);
	}
	
	@DeleteMapping("/{Id}")//Delete
	public Boolean deleteCategory(@PathVariable int Id) {
		categoryRepo.deleteById(Id);
		return Boolean.TRUE;
	}
	
	
	

}
