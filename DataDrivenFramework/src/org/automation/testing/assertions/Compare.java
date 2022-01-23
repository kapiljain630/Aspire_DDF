package org.automation.testing.assertions;

import java.io.IOException;

import org.automation.testing.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {

	//Validate Manufacture order created and exist in manufacture list with same  [based on same manufacture order num]
	
	public Boolean validateManufactureOredrId(WebDriver Driver, String expectOrderNum) throws IOException, Exception
	{
		Thread.sleep(2000);
		Boolean flag = false;
		String str1 = Driver.findElement(By.xpath(Utility.fetchLocators("Manufacture_search_Order_Num"))).getText();
			
		if(str1.equals(expectOrderNum))
		{
			flag = true;
		}
	
		return flag;
	}
	
}