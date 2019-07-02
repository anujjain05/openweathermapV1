package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\jain.anuj\\workspace\\openweathermap\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jain.anuj\\workspace\\openweathermap\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("ff")) {
			System.setProperty("WebDriver.gecko.driver",
					"C:\\Users\\jain.anuj\\workspace\\openweathermap\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browserName.equals("ie")) {
			System.setProperty("WebDriver.ie.driver",
					"C:\\Users\\jain.anuj\\workspace\\openweathermap\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
