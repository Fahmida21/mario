package com.TestRunner.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.TestUtil.testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep",tags= {"@Sanity"})

public class TestRunner extends AbstractTestNGCucumberTests{

@BeforeTest
public void SetUP()  {
	
	testBase test= new testBase();
	test.initil();
	
}
	
@AfterTest
public void teatDown()  {
	
	testBase test= new testBase();
	test.driver.quit();
}
	
	
	
	
}
