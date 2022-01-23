package org.automation.testing.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	

	public static String fetchLocators(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./properties/Application.properties");
		Properties prop = new Properties();
		prop.load(file);
		 return prop.get(key).toString();
		 
	}

}
