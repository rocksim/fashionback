package com.niit.fashhionback.dao;

import java.util.List;


import com.niit.fashhionback.model.Supplier;

public interface SupplierDAO {


	public List<Supplier> list();

	public Supplier get(String id);
	
	public Supplier getByName(String name);

	public void saveOrUpdate(Supplier supplier);

	public String delete(String id);


}
