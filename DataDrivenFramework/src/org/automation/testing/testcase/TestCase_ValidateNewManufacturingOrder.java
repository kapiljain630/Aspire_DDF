package org.automation.testing.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testing.assertions.Compare;
import org.automation.testing.base.DriverInstance;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.InventoryPage;
import org.automation.testing.pages.LoginPage;
import org.automation.testing.pages.ManufacturePage;
import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_ValidateNewManufacturingOrder extends DriverInstance {
	
	
	


	@Test(priority=1)
	public void appLogin() throws Exception  //App Login Flow
	
	{
		LoginPage login = new LoginPage(driver);
		login.enterUserName(); //Calling Enter User Name
		login.enterPassword(); // Calling Enter Password
		login.clickLoginButton();  //Calling Click Login button
	
	}
	
	@Test(priority=2)
	public void inventoryFeature() throws Exception //Navigate to Inventory Feature
	{
		HomePage homePage = new HomePage(driver);
		InventoryPage inventoryPage = new InventoryPage(driver);
		homePage.clickInventory();
		inventoryPage.clickInventoryProducts();
		inventoryPage.clickProductsSubMenu();
	}
	
	@Test(priority=3)
	public void createNewProduct() throws Exception //Create new Product
	{

	
		InventoryPage inventoryPage = new InventoryPage(driver);
		
		inventoryPage.clickProductsCreate();
		inventoryPage.enterProductName();
	
	}
	
	@Test(priority=4)
	public void updateProductQuantity() throws Exception //Update product Quantity in new product entry
	{
		InventoryPage inventoryPage = new InventoryPage(driver);
		inventoryPage.clickUpdateQuantity();
		inventoryPage.clickUpdateQuantityCreate();
		inventoryPage.clickLocation();
		inventoryPage.selectLoaction();
		inventoryPage.addOnHandQuantity();
		inventoryPage.clickSaveQuantity();
		inventoryPage.clickProductNameToBack();
		

}
	@Test(priority=5)
	public void applicationIcon() throws Exception  //Click Application icon, Navigating home page
	{
		InventoryPage inventoryPage = new InventoryPage(driver);
		inventoryPage.clickApplicationIcon();
	}
	
	@Test(priority=6)
	public void createmanufacturingOrder() throws Exception  //create Manufacture Order for new Product
	{
		HomePage homePage = new HomePage(driver);
		ManufacturePage manufacturePage = new ManufacturePage(driver);
	
		homePage.clickAppllicationsManufacturing();
		manufacturePage.clickCreatemanufacturing();
		manufacturePage.selectManufacturingProductId();
		manufacturePage.addManufactureQuantity();
		manufacturePage.enterManufactureBOMName();
		manufacturePage.enterManufactureBOMQTY();
		manufacturePage.clickManufactureBOMSAVE();
		manufacturePage.enterManufactureAddALine();
		manufacturePage.clickManufactureCofirm();
	
	}
	@Test(priority=7)
	public void updateStatusDone() throws Exception  //Update Status As Done
	{
	ManufacturePage manufacturePage = new ManufacturePage(driver);
	
	manufacturePage.clickManufactureOrderMarkAsDone(); 
	
	
	
	}
	
	@Test(priority=8)
	public void validateManufacturigOrder() throws Exception  //Validate the new Manufacturing Order is created with corrected information.

	{
	
		Boolean result;
		String expectedOrderId;
	ManufacturePage manufacturePage = new ManufacturePage(driver);
	Compare compare = new Compare();
	
	expectedOrderId =  manufacturePage.getManufactureOrderNum();
	manufacturePage.clickManufactureOrdersList();
	
	
	manufacturePage.changeManufactureFilterToDone();
	result = compare.validateManufactureOredrId(driver, expectedOrderId);
	System.out.println(result);
	Assert.assertTrue(result);


	}
	
}


