package com.qa.utility;

public class TestUtil extends TestBase {
	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICIT_WAIT = 30;

	public void refresh_page() {
		driver.switchTo().alert().accept();
	}
}