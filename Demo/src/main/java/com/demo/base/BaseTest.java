package com.demo.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;

	public void launchBrowser(String sBrowserName) {
		driver = getDriver(sBrowserName);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.MILLISECONDS);
	}

	public WebDriver getDriver(String sBrowserName) {

		sBrowserName = sBrowserName.toLowerCase();

		switch (sBrowserName) {
		
	    case "chrome":
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
            break; 
            
	    case "firefox":
	    	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
			break;
			
	    case "ie":
	    	WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();	
			break;
			
	    default:
	    	driver = null;
		
	}
		return driver;
}
}