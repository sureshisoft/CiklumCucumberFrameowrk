package com.ciklum.Stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ciklum.pageclass.CiklumAboutusPage;
import com.ciklum.pageclass.CiklumwhatwedolinkPage;
import com.ciklum.utilities.Ciklumcommonutils;
import com.webdriver.manager.DriverManager;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinition {
	
	

	public static WebDriver driver;		
	
	public static final Logger LOGGER=LogManager.getLogger(CommonStepDefinition.class);
	
	@Before
	public void beforeScenario()
	{
		LOGGER.info("Execution status started ");
		try
		{
			Ciklumcommonutils.loadProperties();
			LOGGER.info("Driver is Instatiated sucessfully");
			if(DriverManager.getDriver()==null)
			{
			DriverManager.launchBrowser();
			initElements();
		}
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	public void initElements()
	{
		PageFactory.initElements(DriverManager.getDriver(),CiklumwhatwedolinkPage.class);
		PageFactory.initElements(DriverManager.getDriver(),CiklumAboutusPage.class);
	}
}
	
	
