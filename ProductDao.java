package com.niit.fashhionback.dao;



import java.util.List;

import com.niit.fashhionback.model.Product;
public interface ProductDao {


	public List<Product> list();

	public Product get(String id);

	public void saveOrUpdate(Product product);

	public void delete(String id);


}
