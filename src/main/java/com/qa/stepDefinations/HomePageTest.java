package com.qa.stepDefinations;



import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTest extends TestBase {
	HomePage homepage;
	
	
	@Given("^User open the browser and enter the URL$")
	public void user_open_the_browser_and_enter_the_URL(){
		TestBase.initialization();

	}

	@Then("^Verify the Home page Title$")
	public void verify_the_Home_page_Title(){
//		if(driver.getTitle().equals("Сurrent weather and forecast - OpenWeatherMap"));
//		Assert.assertTrue(true);
		Assert.assertTrue(homepage.validateTitle().equals("Сurrent weather and forecast - OpenWeatherMap"));
	}

	@Then("^verify the Wheather label is visible$")
	public void verify_the_Wheather_label_is_visible(){
		Assert.assertTrue(homepage.verifyweather());

	}

	@Then("^verify the Map label is visible$")
	public void verify_the_Map_label_is_visible() throws Throwable {

	}

	@Then("^verify the Guide label is visible$")
	public void verify_the_Guide_label_is_visible() throws Throwable {
	}

	@Then("^verify the Price label is visible$")
	public void verify_the_Price_label_is_visible() throws Throwable {
	}

	@Then("^verify the Partners label is visible$")
	public void verify_the_Partners_label_is_visible() throws Throwable {
	}

	@Then("^verify the Solutions label is visible$")
	public void verify_the_Solutions_label_is_visible() throws Throwable {
	}

	@Then("^verify the Widgets label is visible$")
	public void verify_the_Widgets_label_is_visible() throws Throwable {
	}

	@Then("^verify the Blog label is visible$")
	public void verify_the_Blog_label_is_visible() throws Throwable {
	}

}
