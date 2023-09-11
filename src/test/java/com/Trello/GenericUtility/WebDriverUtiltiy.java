package com.Trello.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtiltiy {

	public void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
