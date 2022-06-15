package com.kunal.testUnit.dao;

public interface ILoginDao {
	
	public boolean login(String username,String password);

	public int authenticate(String username, String password);
	

}
