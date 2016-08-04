package com.niit.fashhionback.dao

import java.util.List;


import com.niit.fashhionback.model.Cart;

public interface CartDao {


	public List<Cart> list();

	public Cart get(String id);
	public void saveOrUpdate(Cart Cart);

	public String delete(String id);
	
	public int getTotalAmount(String id);


}
