package com.ciklum.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CiklumAboutusPage {
	
	@FindBy(xpath="//a[contains(text(),'About us')]")
	public static WebElement aboutUslinkclick;

}
