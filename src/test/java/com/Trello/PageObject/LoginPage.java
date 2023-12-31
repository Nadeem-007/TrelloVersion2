package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement emailTxtField;
	
	@FindBy(id="login-submit")
	private WebElement continueButtonInLoginPage;
	
	public WebElement getEmailTxtField() {
		return emailTxtField;
	}
	
	public WebElement getcontinueButtonInLoginpage() {
		return continueButtonInLoginPage;
	}
}
