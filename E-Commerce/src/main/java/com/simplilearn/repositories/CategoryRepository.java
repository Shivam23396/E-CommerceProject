package com.simplilearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
