package org.automation.testing.pages;

import java.io.IOException;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver Driver;
	
		
	public HomePage(WebDriver Driver)
	{
		this.Driver=Driver;
			
	}		
	


	//Click Inventory from home page
	public void clickInventory() throws IOException
	{
	Driver.findElement(By.xpath(Utility.fetchLocators("Home_Page_Inventory"))).click();
	}
	
	//Click Manufacturing from Home page
	public void clickAppllicationsManufacturing() throws IOException
	{
		
	Driver.findElement(By.xpath(Utility.fetchLocators("Applications_Manufacturing"))).click();

	}
	

}
