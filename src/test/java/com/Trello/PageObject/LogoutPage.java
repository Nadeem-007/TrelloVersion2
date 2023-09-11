package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"logout-submit\"]/span[text()=\"Log out\"]")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
}
