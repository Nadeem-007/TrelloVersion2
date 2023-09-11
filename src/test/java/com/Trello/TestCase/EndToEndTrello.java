package com.Trello.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trello.PageObject.BoardsPage;
import com.Trello.PageObject.IndexPage;
import com.Trello.PageObject.JailerPage;
import com.Trello.PageObject.LoginPage;
import com.Trello.PageObject.LoginToContinuePage;
import com.Trello.PageObject.LogoutPage;

public class EndToEndTrello extends BaseClass{

	@Test
	public void endToEndTrello() throws InterruptedException, IOException {
		
		IndexPage index=new IndexPage(driver);
		Thread.sleep(2000);

		index.getloginOption2().click();
		logger.info("LoginOption is Clicked in Index page");

		Assert.assertEquals(driver.getTitle(), "Log in to Trello");
		logger.info("Title is as Expected");

		Thread.sleep(2000);

		LoginPage login=new LoginPage(driver);

		login.getEmailTxtField().sendKeys(fileutils.ReadDataFromPropertiesFile("email"));
		logger.info("Email entered in Email TextField");

		Thread.sleep(2000);

		login.getcontinueButtonInLoginpage().submit();
		logger.info("Clicked on Continue button in Login Page");
		Thread.sleep(2000);

		LoginToContinuePage loginContinue=new LoginToContinuePage(driver);
		Thread.sleep(2000);

		loginContinue.getPwdTxtField().sendKeys(fileutils.ReadDataFromPropertiesFile("password"));
		logger.info("Password entered in LoginToContinue Page");
		
		loginContinue.getLogToContinueButton().submit();;
		
		
		Thread.sleep(2000);

		logger.info("Clicked on login button in LoginToContinue Page");

		
		BoardsPage boards=new BoardsPage(driver);
		Thread.sleep(3000);

		boards.getCreateBoard().click();
		logger.info("Clicked on Create Boards");

		
		boards.getBoardTitle().sendKeys("boardtitle");
		Thread.sleep(3000);

		logger.info("Passed title inside boardtitle");

		
		boards.getCreateButton().click();
		Thread.sleep(3000);

		logger.info("Clicked on Create button in Boards page");

		
		JailerPage jailer=new JailerPage(driver);
		
		jailer.getmenuOption().click();
		Thread.sleep(3000);

		logger.info("Clicked on Menu Option in jailer page");
		
		jailer.getcloseBoard().click();
		Thread.sleep(3000);

		logger.info("Clicked on close boards in jailer page");

		jailer.getcloseButton().click();
		Thread.sleep(2000);

		logger.info("Clicked on close button in jailer page");
		
		jailer.getDeleteBoardLink().click();
		Thread.sleep(2000);

		logger.info("Permanently delete board is clicked");

		
		jailer.getDeleteOption().click();
		Thread.sleep(2000);

		logger.info("Deleted Option is clicked");

		boards.getAccountLink().click();
		Thread.sleep(2000);

		logger.info("Boards Page Account link is clicked");

		
		boards.getLogoutOption().click();
		Thread.sleep(2000);

		logger.info("Boards Page Logout Option is clicked");
		
		LogoutPage logout=new LogoutPage(driver);
		logout.getLogoutButton().submit();
		Thread.sleep(2000);

		logger.info("Logout is done Successfully ");


		
		
		


	}
}
