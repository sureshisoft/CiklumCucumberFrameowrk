package com.ciklum.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ciklumcommonutils {
	
	public static String BROWSER;

	public static void loadProperties() throws FileNotFoundException
	{
		
		
		FileReader fis= new  FileReader("C:\\Users\\LT-SUKR\\eclipse-workspace\\CiklumCucumberFramework\\config.properties");
		Properties prop= new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		  BROWSER =prop.getProperty("browser");
	}
	
}
