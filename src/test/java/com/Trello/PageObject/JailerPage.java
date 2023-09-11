package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JailerPage {
	WebDriver driver;

	public JailerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//======To Delete Jailer Page
	
		@FindBy(xpath="//button[@aria-label=\"Show menu\"]")
		private WebElement menuOption;
		
		@FindBy(xpath="//a[@class=\"board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board\"]")
		private WebElement closeBoard;
		
		@FindBy(xpath="//input[@class=\"js-confirm full nch-button nch-button--danger\"]")
		private WebElement closeButton;
		
		@FindBy(xpath="//button[text()=\"Permanently delete board\"]")
		private WebElement deleteBoardLink;
		
		@FindBy(xpath="//button[text()=\"Delete\"]")
		private WebElement deleteOption;
		
		
		public WebElement getmenuOption() {
			return menuOption;
		}
		
		public WebElement getcloseBoard() {
			return closeBoard;
		}
		
		public WebElement getcloseButton() {
			return closeButton;
		}
		
		public WebElement getDeleteBoardLink() {
			return deleteBoardLink;
		}
		
		public WebElement getDeleteOption() {
			return deleteOption;
		}
}
