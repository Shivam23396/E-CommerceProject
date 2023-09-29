package com.simplilearn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Category;
import com.simplilearn.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public void addCategory(Category category) {
		
		categoryRepository.save(category);
		
	}
	
	public List<Category> getAllCategories(){
		
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(int id){
		
		Optional<Category> categoryById = categoryRepository.findById(id);
		return categoryById;
		
	}
	
	public void removeById(int id) {
		
		categoryRepository.deleteById(id);
		
	}
	
	
	

}
