package com.myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/appFeatures/" }, 
glue = { "stepDefinitions", "appHooks" }, 
plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//this adapter needed for the new extent reports.

)
public class MyTestRunner {

}
