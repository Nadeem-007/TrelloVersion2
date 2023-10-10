package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	WebDriver driver;   // this driver will control the browser
	
	public IndexPage(WebDriver driver) // this driver will find the elements on the Web-page 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this); /* We are here saying that both the driver are same by doing initElements(driver,this). By doing this both driver act as one */														
		
	}
 
	// 1st way login option     Note: use any of the below 2 ways for clicking on login option
		@FindBy(xpath="//div[@class=\"Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI\"]/a[text()=\"Log in\"]")
		private WebElement loginOption1;  
		 
		//2nd way login option
		@FindBy(xpath="//a[text()=\"Get Trello for free\"]/preceding-sibling::a[text()=\"Log in\"]")  
		private WebElement loginOption2;  // going back from <a> tag to another <a> tag use preceding sibling 
		
		public WebElement getloginOption2() {
			return loginOption2;
		}
		
		public WebElement getloginOption1() {
			return loginOption1;
		}
	

}
