package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json"
}
		,features = {"C:\\Users\\jyoth\\workspace-Interview\\cucumberSample\\resources\\login.feature"},
	glue = {"com.training.step"})
public class Runner {
	

}

