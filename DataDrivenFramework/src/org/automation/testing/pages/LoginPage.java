package org.automation.testing.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class LoginPage {
	
	WebDriver Driver;
	
	public LoginPage(WebDriver Driver)
	{
		this.Driver=Driver;
			
	}	
	
	//Enter User name
	public void enterUserName() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Login_Page_Username_Xpath"))).sendKeys(Utility.fetchLocators("Application_Username"));
		
	}
	
	//Enter Password
	public void enterPassword() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Login_Page_Password_Xpath"))).sendKeys(Utility.fetchLocators("Application_Password"));
	}
	
	//Click Login button
	public void clickLoginButton() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Login_Page_Login_Button_Xpath"))).click();
	}
	
		
}

