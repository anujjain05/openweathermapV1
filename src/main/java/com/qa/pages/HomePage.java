package com.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = ".//a[text() = 'Weather']") 
	WebElement weather;
	
	@FindBy(xpath = ".//input[@id = './/a[text() = 'Maps ']") 
	WebElement maps;
	
	@FindBy (xpath = ".//a[text() = 'Guide']") WebElement guide;
	
	@FindBy (xpath = ".//a[text() = 'API']") WebElement api;
	
	@FindBy (xpath = ".//a[text() = 'Price']") WebElement price;
	
	@FindBy (xpath = ".//a[text() = 'Partners']") WebElement partners;
	
	@FindBy (xpath = ".//a[text() = 'Stations']") WebElement stations;
	
	@FindBy (xpath = ".//a[text() = 'Widgets']") WebElement widgets;
	
	@FindBy (xpath = ".//a[contains(text(),'Blog')]") WebElement blog;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public  boolean verifyweather() {
		return weather.isDisplayed();	
	}

}
