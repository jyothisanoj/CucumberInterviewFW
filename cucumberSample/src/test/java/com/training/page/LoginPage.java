package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver = BaseTest.getDriver());
		addObj("username",By.id("session_key"));
		addObj("password",By.id("session_password"));
	}

}
