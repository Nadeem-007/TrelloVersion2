package com.Trello.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsPage {
	WebDriver driver;
	public BoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//=========TO Create Board
	@FindBy(xpath="//li[@data-testid=\"create-board-tile\"]/div[@class=\"board-tile mod-add\"]")
	private WebElement createBoard;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement boardTitle;
	
	@FindBy(xpath="//button[text()=\"Create\"]")
	private WebElement createButton;
	
	@FindBy(xpath="//button[@aria-label=\"Open member menu\"]")
	private WebElement accountLink;
	
	@FindBy(xpath="//button/span[text()=\"Log out\"]")
	private WebElement logoutOption;
	
	
	public WebElement getCreateBoard() {
		return createBoard;
	}
	
	public WebElement getBoardTitle() {
		return boardTitle;
	}
	
	public WebElement getCreateButton() {
		return createButton;
	}
	
	public WebElement getAccountLink() {
		return accountLink;
	}
	public WebElement getLogoutOption() {
		return logoutOption;
	}
	
	
}
