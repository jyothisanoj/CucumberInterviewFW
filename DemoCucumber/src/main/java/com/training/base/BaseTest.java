package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;
	
	public void launchBrowser() {
		if(driver == null) {
		driver = getDriver();
		driver.get("https://login.salesforce.com");
	}
	}

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();		
		driver= new ChromeDriver();
		
		return driver;
	}
	

}
