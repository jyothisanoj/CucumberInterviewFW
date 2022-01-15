package com.training.base;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	public HashMap<String,By> objRepo = new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void addObject(String logicalName,By by) {
		objRepo.put(logicalName, by);
	}
	
	public void enterIntoTextBox(String logicalName,String value) {
		WebElement element = getWebElemnt(logicalName);
		enterIntoTextBox(element,value);		
	}
	
	public void clickButton(String logicalName) {
		WebElement element = getWebElemnt(logicalName);
		clickButton(element);
	}

	private void clickButton(WebElement element) {
		waitForElement(element);
		element.click();		
	}
	
	public void verifyTextValue(String logicalValue,String expectedValue) {
		WebElement element = getWebElemnt(logicalValue);
		verifyTextValue(element,expectedValue);
		
	}
	private void verifyTextValue(WebElement element,String expectedValue) {
		waitForElement(element);
		String actualValue = element.getText();
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	private void enterIntoTextBox(WebElement element, String value) {
		waitForElement(element);
		element.sendKeys(value);
		
	}

	private WebElement getWebElemnt(String logicalName) {
		WebElement element = null;
		By by = null;
		by = objRepo.get(logicalName);
		element = driver.findElement(by);		
		return element;
	}
	
	private void waitForElement(WebElement elemnt) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(elemnt));
		
	}

}
