package com.training.step;



import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Step extends BaseTest{
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	@Before
	public void setup() {
		launchBrowser();
	}

	@Given("User is on {string}")
	public void user_is_on(String PageNmae) {
	    page = pageFactory.initialize(PageNmae);
	}
	@When("User enters value into textbox {string} {string}")
	public void user_enters_value_into_textbox(String logicalName, String value) {
		page.enterIntoTextBox(logicalName, value);
	   
	}
	@When("User clicks {string}")
	public void user_clicks(String logicalName) {
	    page.clickButton(logicalName);
	}
	@Then("User validates the text {string} {string}")
	public void user_validates_the_text(String logicalName, String expectedvalue) {
	   page.verifyTextValue(logicalName, expectedvalue); 
	}


}
