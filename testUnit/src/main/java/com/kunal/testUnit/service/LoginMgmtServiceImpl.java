package com.kunal.testUnit.service;

import com.kunal.testUnit.dao.ILoginDao;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	
	private ILoginDao loginDao;

	public LoginMgmtServiceImpl(ILoginDao loginDao) {
		this.loginDao=loginDao;
	}
	
	public boolean login(String username,String password) {
		if(username.equals("")||password.equals("")) {
			throw new IllegalArgumentException("Fields are empty");
		}
		int count=loginDao.authenticate(username,password);
		if(count==0)
			return false;
		else
			return true;
	}
}
