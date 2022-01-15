package com.demo.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.base.BasePage;

public class LoginPage extends BasePage {
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="email")
	public WebElement username;
	
	@FindBy(id ="pass")
	public WebElement password;
	
	@FindBy(name ="login")
	public WebElement loginbtn;
	
	
	
	public void enterIntoUserName(String sUsername) {
		waitMethod(username);
		username.sendKeys(sUsername);		
	}
	
	public void enterIntoPassword(String spassword) {
		waitMethod(password);
		password.sendKeys(spassword);		
	}

    public void clickLoginButton() {
    	waitMethod(loginbtn);
    	loginbtn.click();
    	
    }
}
