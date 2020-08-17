package com.sanjay.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay.entity.Product;


public interface ProductReposistory extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
