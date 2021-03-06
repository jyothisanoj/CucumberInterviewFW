package com.training.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static WebDriver driver;

	public void launchBrowser() {
		driver = getDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
	}

	public static WebDriver getDriver() {
		
    if(driver == null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
    return driver;
	}
}
