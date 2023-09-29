package com.simplilearn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	 List<Product> findAllByCategory_Id(int id);

}
