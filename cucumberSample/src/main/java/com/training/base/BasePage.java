package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	public HashMap<String,By> objRepo = new HashMap<String,By>(); 
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void addObj(String logicalName,By by) {
		objRepo.put(logicalName, by);		
	}
	
	public void enterIntoTextBox(String logicalName,String value) {
		WebElement element = getElement(logicalName);
		waitforelement(element);
		enterIntoTextBox(element,value);
	}


	private void enterIntoTextBox(WebElement element, String value) {
		element.sendKeys(value);
		
	}


	private WebElement getElement(String logicalName) {
		WebElement element = null;
		By by = null;
		by = objRepo.get(logicalName);
		element = driver.findElement(by);		
		return element;
	}
	
	private void waitforelement(WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele));
				
	}
	
	

}
