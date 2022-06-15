package com.kunal.testUnit.service;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.kunal.testUnit.dao.ILoginDao;

public class LoginMgmtServiceTest {
	
	private static ILoginMgmtService loginService;
	private static ILoginDao loginDaoMock;

	@BeforeAll
	public static void setupOnce() {
		loginDaoMock=Mockito.mock(ILoginDao.class);
		
		loginService=new LoginMgmtServiceImpl(loginDaoMock);
	}
	
	@AfterAll
	public static void clearOnce() {

		loginDaoMock=null;
		loginService=null;
	}
	@Test
	public void testLoginWithValidCredientials() {
		Mockito.when(loginDaoMock.authenticate("username", "password")).thenReturn(1);
		assertTrue(loginService.login("username","password"));
	}
	
	@Test
	public void testLoginWithInvalidCredientials() {
		Mockito.when(loginDaoMock.authenticate("username", "password")).thenReturn(0);
		assertFalse(loginService.login("username","passwordWrong"));
	}
	
	@Test
	public void testLoginWithNoCredientials() {
		assertThrows(IllegalArgumentException.class,()->loginService.login("",""));
	}
	
	
}
