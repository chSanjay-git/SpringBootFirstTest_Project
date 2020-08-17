package com.sanjay.service;

import java.util.List;

import com.sanjay.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> saveProducts(List<Product> products);

	public List<Product> getProducts();

	public Product getProductById(int id);

	public Product getProductByName(String name);

	public String deleteProdeuct(int id);

	public Product updateProduct(Product product);

}
