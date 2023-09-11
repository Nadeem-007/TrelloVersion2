package com.Trello.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Trello.GenericUtility.FileUtility;
import com.Trello.GenericUtility.WebDriverUtiltiy;

public class BaseClass {

	public static WebDriver driver;
	
	public WebDriverUtiltiy wait=new WebDriverUtiltiy();
	
	public FileUtility fileutils=new FileUtility();
	public static Logger logger;

	
	@BeforeClass
	public void setUp() throws IOException {
		
		String browser = fileutils.ReadDataFromPropertiesFile("browser");
		
		if(browser.equals("chrome")) {  /*Method Overridding Example in Selenium, browser are getting replaced
		 								  at runtime depending on browser given and body will be different */
			driver=new ChromeDriver(); 
		}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		logger=LogManager.getLogger("TrelloETOE");

		driver.get(fileutils.ReadDataFromPropertiesFile("url"));
		logger.info("URL is triggered");
		driver.manage().window().maximize();
		wait.ImplicitWait(driver);
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().window().minimize();
		driver.close();
		driver.quit();
	}
}
