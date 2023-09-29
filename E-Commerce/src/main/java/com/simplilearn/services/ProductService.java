package com.simplilearn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Product;
import com.simplilearn.repositories.CategoryRepository;
import com.simplilearn.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		
		return productRepository.findAll();
	}
	
	public void addProduct(Product product){
		
		productRepository.save(product);
	}
	
	public void removeProductById(int id) {
		
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(int id){
		
		Optional<Product> product = productRepository.findById(id);
		
		return product;
		
	}
	
	public List<Product> getAllProductByCategoryId(int id){
		
		return productRepository.findAllByCategory_Id(id);
		
	}

}
