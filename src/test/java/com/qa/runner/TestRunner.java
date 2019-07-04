package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\jain.anuj\\workspace\\openweathermap\\src\\main\\java\\com\\qa\\features\\openweather.feature",
glue = {"com\\qa\\stepDefinations" }, 
plugin = { "pretty", "html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber" },
			monochrome = true, 
			strict = true, 
			dryRun = true)

public class TestRunner{

}

