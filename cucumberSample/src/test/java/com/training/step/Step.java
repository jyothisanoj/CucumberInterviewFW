package com.training.step;

import com.training.base.BaseTest;
import com.training.page.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Step extends BaseTest{
	
	
   LoginPage page;
	
	@Before
	public void setup() {
		launchBrowser();
		page = new LoginPage(getDriver());
	}

	@Given("user enters value into textBox {string} {string}")
	public void user_enters_value_into_text_box(String LogicalName, String value) {
		System.out.println(LogicalName);
		page.enterIntoTextBox(LogicalName, value);
	}
	
	@When("user clicks {string}")
	public void user_clicks(String string) {
		System.out.println(string);
	}
	
	@Then("user verify the textvalue {string} {string}")
	public void user_verify_the_textvalue(String string, String string2) {
		System.out.println(string2);
		System.out.println(string);
	}

}
