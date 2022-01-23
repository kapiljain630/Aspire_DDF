package org.automation.testing.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class DriverInstance {
	
	 public WebDriver driver;
	
	 @BeforeSuite
	public void initiateDriverInstanse() throws IOException
	
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(Utility.fetchLocators("Application_Url").toString());
	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	 
	 @AfterSuite
	 public void closeBrowser()
	 {
		//driver.quit();
	 }
	 
	 @BeforeMethod
	 public void initiateDriverInstanse1()
		
		{}
	 
	 @AfterMethod
	 public void initiateDriverInstanse2()
		{		}
	  
		
	 

}
