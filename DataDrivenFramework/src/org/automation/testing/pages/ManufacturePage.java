package org.automation.testing.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ManufacturePage {
	
	WebDriver Driver;
	String ordernum;
	
	
	public ManufacturePage(WebDriver Driver)
	{
		this.Driver=Driver;
			
	}
	
	//Click on Create to create manufacture order
	public void clickCreatemanufacturing() throws IOException
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacturing_Create"))).click();
	}


	//Add Same product id as same as created order
	public void selectManufacturingProductId() throws IOException, Exception
	{
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Product_Id"))).click();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Product_Id"))).sendKeys(Utility.fetchLocators("Product_NameText"));
		Thread.sleep(2000);		
		Actions act = new Actions(Driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	//Add Product Quantity to manufacture
	public void addManufactureQuantity() throws IOException	{
		
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Quantity"))).clear();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Quantity"))).sendKeys("20");
		Actions act = new Actions(Driver);
		act.sendKeys(Keys.TAB).sendKeys("Dozens").build().perform();
	}
	
	
	//Add Product Bill name
	public void enterManufactureBOMName() throws IOException, Exception
	{
		Actions act = new Actions(Driver);
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Bill_Of_Material"))).sendKeys(Utility.fetchLocators("Product_NameText"));
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	//Add Product Quantity on Manufacture Bill and update unit measure
	public void enterManufactureBOMQTY() throws IOException
	{
		Actions act = new Actions(Driver);
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_BOM_QTY"))).click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("20").build().perform();
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("DOZENS").build().perform();
	}
	
	
	// Save Bill Details
	public void clickManufactureBOMSAVE() throws IOException
	{
	Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_BOM_SAVE"))).click();
	}
	
	//Add Details for product to be manufacture
	public void enterManufactureAddALine() throws IOException, Exception
	{
		Actions act = new Actions(Driver);
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Add_A_Line"))).click();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Add_A_Line_Product_ID"))).sendKeys(Utility.fetchLocators("Product_NameText"));
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys("20").sendKeys(Keys.TAB).sendKeys("Dozens").build().perform();
	}
	
	//Confirm Order after update all details for  manufacture
	public void clickManufactureCofirm() throws IOException
	{
	Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Confirm"))).click();
	}
	
	//Update product status if all Quantity is available and save the details
	public void clickManufactureOrderMarkAsDone() throws IOException, Exception
	{
		Thread.sleep(4000);
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Order_Mark_As_Done"))).click();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Order_Mark_As_Done_Apply"))).click();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Order_Save"))).click();
	}
	
	
	//get manufacturing order Number
	public String getManufactureOrderNum() throws IOException
	{
	
		String str = Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Order_Num"))).getText();
		
		return str;
	}
	
	
		
	//Open Manufacture Order List
	public void clickManufactureOrdersList() throws IOException
	{
		ordernum= this.getManufactureOrderNum();
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacturing_Orders_List"))).click();
	}
	
	//Change Search filter to Done and search for same Manufacture order num as created
	public void changeManufactureFilterToDone() throws IOException
	{
		
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacturing_TODO_Remove"))).click();
	
		Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_Order_Search"))).sendKeys(ordernum);
		Actions act = new Actions(Driver);
	
		act.sendKeys(Keys.ENTER).perform();
	}
	
	

	
	
	
	
	

}
