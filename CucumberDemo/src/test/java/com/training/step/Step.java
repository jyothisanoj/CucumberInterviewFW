package com.training.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
	protected WebDriver driver;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("fb");
	}
	
	@Given("user enter into textbox {string} {string}")
	public void user_enter_into_textbox(String string, String string2) {
	    System.out.println("given");
	}
	@When("user clicks loginButton")
	public void user_clicks_login_button() {
		System.out.println("when");
	}
	@Then("user is in homepage")
	public void user_is_in_homepage() {
		System.out.println("Then");
	}



}
