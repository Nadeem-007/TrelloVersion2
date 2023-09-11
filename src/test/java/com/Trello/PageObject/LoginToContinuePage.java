package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinuePage {

	WebDriver driver;
	
	public LoginToContinuePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/input[@id=\"password\"]")
	private WebElement pwdTxtField;
	
	@FindBy(id="login-submit")
	private WebElement logToContinueButton;
	
	public WebElement getPwdTxtField() {
		return pwdTxtField;
	}
	
	public WebElement getLogToContinueButton() {
		return logToContinueButton;
	}
}
