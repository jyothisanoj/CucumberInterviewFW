package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
        "html:target/cucumber-reports/cucmber.html",
        "json:target/cucumber-reports/cucmber.json"
},
		features = {"C:\\Users\\jyoth\\workspace-Interview\\DemoCucumber\\resources\\login.feature"},
glue = {"com.training.step"})

public class Runner {

}
