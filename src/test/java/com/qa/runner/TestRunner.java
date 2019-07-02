package com.qa.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\jain.anuj\\workspace\\openweathermap\\src\\main\\java\\com\\qa\\features\\openweather.feature", glue = {
		"com\\qa\\stepDefinations" }, plugin = { "pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:test-output/reports.html", "html:test-output",
				"json:json_output/cucumber.json",
				"junit:junit_xml/cucumber" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {
	@AfterClass
	public static void ExtentReport() {
		Reporter.loadXMLConfig(
				"C:\\Users\\jain.anuj\\workspace\\openweathermap\\src\\main\\java\\com\\qa\\config\\extent-config.xml");
		Reporter.setSystemInfo("Browser", "Chrome");
		Reporter.setSystemInfo("SyStem-Config", "Win-7,64Bit");
		Reporter.setSystemInfo("HostName", "Anuj Jain");
	}

	@AfterClass
	public static void TearDown() {

	}
}
