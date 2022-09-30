package com.ciklum.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CiklumwhatwedolinkPage {
	
	
	//user should give url in browser 
	
	//public static WebElement url;
	
	//clickon Main menu
	
	@FindBy(xpath="//a[@class='mobileTrigger']")
	public static WebElement mainMenulinkClick;
	
	@FindBy(xpath="//a[contains(text(),'What we do')]")
	public static WebElement whatWedoLinkClick;

}
