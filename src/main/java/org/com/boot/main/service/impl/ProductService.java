package org.com.boot.main.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.com.boot.main.deo.DaoRepository;
import org.com.boot.main.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductService {

	private List<Product> products;
	
	Product product;
	
	  @Autowired 
	  DaoRepository daoRepository;
	 
	
	public ProductService() {
	}

	public List<Product> findAll() {
		List<Product> allProducts = daoRepository.findAll(); 
		return allProducts;
	}

	
	  
	public Product find(String code) {
	    
	  List<Product> allProducts = daoRepository.findAll(); 
	  for (Product product : allProducts) 
	  { 
		  if (product.getCode().equalsIgnoreCase(code)) 
		  { 
			  return product; 
		    } 
		  }
	  
	  return product; 
	  }

	public void save(@Valid Product product) {
		
		daoRepository.save(product);
	}
	 
}
