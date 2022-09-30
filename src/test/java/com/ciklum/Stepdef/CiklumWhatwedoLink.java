package com.ciklum.Stepdef;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver.manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.ciklum.pageclass.*;

public class CiklumWhatwedoLink {
	
	
	
	@Given("The user should launch the chromebrowser")
	public void the_user_should_launch_the_chromebrowser() {
		
		System.out.println("Browser launched sucessfully");
	}

	@When("User should give the ciklumwebsite url and Click on Main menu")
	public void user_should_give_the_ciklumwebsite_url_and_click_on_main_menu() throws SQLException {
		DriverManager.getDriver().get("https://wwww.cilum.com");
		//DriverManager.getDriver().findElement(By.xpath("//a[@class='mobileTrigger']")).click();
		CiklumwhatwedolinkPage.mainMenulinkClick.click();
	}

	@Then("User should click mainmenu and clickwhatwedo link")
	public void user_should_click_mainmenu_and_clickwhatwedo_link() {
	    
	   // DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'What we do')]")).click();
		CiklumwhatwedolinkPage.whatWedoLinkClick.click();
	}

}
