package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver = BaseTest.getDriver());
		addObject("username",By.id("username"));
		addObject("password",By.id("password"));
		addObject("LoginButton",By.id("Login"));
		addObject("errmsg",By.id("error"));
	}

}


