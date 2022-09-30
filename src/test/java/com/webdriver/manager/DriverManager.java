package com.webdriver.manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ciklum.Stepdef.CommonStepDefinition;
import com.ciklum.utilities.Ciklumcommonutils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public static final Logger LOGGER=LogManager.getLogger(DriverManager.class);
	
	public static WebDriver driver=null;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void launchBrowser()
	{
		try
		{
			switch(Ciklumcommonutils.BROWSER)
			{
			case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


