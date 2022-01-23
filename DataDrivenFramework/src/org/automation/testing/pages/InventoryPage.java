package org.automation.testing.pages;

import java.io.IOException;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	WebDriver Driver;
	
	
	public InventoryPage(WebDriver Driver)
	{
		this.Driver=Driver;
			
	}
	
	//Click Products Menu form inventory page
	public void clickInventoryProducts() throws IOException
	{
	Driver.findElement(By.xpath(Utility.fetchLocators("Inventory_ProductsMenu"))).click();
	}
	
	//Click Products Sub-menu from Product menu on  inventory page
	public void clickProductsSubMenu() throws IOException
	{
	Driver.findElement(By.xpath(Utility.fetchLocators("Inventory_ProductMenu_ProductsSubMenu"))).click();
	}
	
	//Click on Create from inventory products page
	public void clickProductsCreate() throws IOException, InterruptedException
	{
     
		Thread.sleep(4000);
		Driver.findElement(By.xpath(Utility.fetchLocators("Products_Create"))).click();
	}
	
	//Enter Product name for new product
	public void enterProductName() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Product_Name"))).sendKeys(Utility.fetchLocators("Product_NameText"));
		
	}
	
	//Open Updated Quantity page for new product page
	public void clickUpdateQuantity() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Update_Quantity"))).click();
	}
	
	//Create Entry for Location and Quantity
	public void clickUpdateQuantityCreate() throws IOException, Exception
	{
		Thread.sleep(4000);
		Driver.findElement(By.xpath(Utility.fetchLocators("Update_Quantity_Create"))).click();
	}
	
	//Open Location options for new product entry
	public void clickLocation() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Location"))).click();
	}
	
	//Select Location for new product
	public void selectLoaction() throws IOException
	{
		
		Driver.findElement(By.xpath(Utility.fetchLocators("WhStock"))).click();
	}
	
	//Add on Hand Quantity for new product
	public void addOnHandQuantity() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("OnHand_Quanity"))).clear();
		Driver.findElement(By.xpath(Utility.fetchLocators("OnHand_Quanity"))).sendKeys("20");
	
	}
	
	//Save new entry details for location and Quantity
	public void clickSaveQuantity() throws IOException
	{
		
		Driver.findElement(By.xpath(Utility.fetchLocators("Save_Quantity"))).click();
	}
	
	//Go back to new Product detail page
	public void clickProductNameToBack() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Product_Name_Back"))).click();
	}
	
	//Go back to Home page
	public void clickApplicationIcon() throws IOException, Exception
	{
		Thread.sleep(2000);
		Driver.findElement(By.xpath(Utility.fetchLocators("Application_Icon"))).click();
	}

	
}
