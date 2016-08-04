package com.niit.fashhionback.dao;


import com.niit.fashhionback.model.Account;

public interface AccountDao {
	public Account get(String id);
	public boolean trasfer(String id, int amount);


}
