package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.simplilearn.global.GlobalData;
import com.simplilearn.services.CategoryService;
import com.simplilearn.services.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("cartCount",GlobalData.cart.size());
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model) {
		
		model.addAttribute("cartCount",GlobalData.cart.size());
		model.addAttribute("products",productService.getAllProducts());
		model.addAttribute("categories",categoryService.getAllCategories());
		
		
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String viewProductByCategories(Model model, @PathVariable int id) {
		
		model.addAttribute("cartCount",GlobalData.cart.size());
		model.addAttribute("categories",categoryService.getAllCategories());
		model.addAttribute("products",productService.getAllProductByCategoryId(id));
		
		return "shop";
	}
	
	@GetMapping("shop/viewproduct/{id}")
	public String viewProducts(Model model, @PathVariable int id) {
		
		model.addAttribute("cartCount",GlobalData.cart.size());
		model.addAttribute("product",productService.getProductById(id).get());
		
		return "viewProduct";
	}

}
