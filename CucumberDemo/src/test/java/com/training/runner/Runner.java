package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\jyoth\\workspace-Interview\\CucumberDemo\\resources\\facebook.feature"},
glue = {"com.training.step"})
public class Runner {

}
