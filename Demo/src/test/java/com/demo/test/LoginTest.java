package com.demo.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.BaseTest;
import com.demo.page.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage login;
	
	@BeforeMethod
	public void setup() {
		launchBrowser("Chrome");
		login = new LoginPage(driver);
	}

	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}
	
	@Test
	public void login() {
		login.enterIntoUserName("Jyothi");
		login.enterIntoPassword("Jyothi");
		login.clickLoginButton();
	}
}
