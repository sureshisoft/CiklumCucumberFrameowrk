package com.ciklum.Stepdef;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ciklum.pageclass.*;
import com.ciklum.pageclass.CiklumAboutusPage.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AboutusStepdef {
	

	
	@Given("user should launch chrome browser")
	public void user_should_launch_chrome_browser() {
	    
		System.out.println("Browser launched sucessfully");
		
	}

	@When("User should give the ciklum website")
	public void user_should_give_the_ciklum_website() throws SQLException {
		DriverManager.getDriver("https://www.ciklum.com/");
	}

	@Then("User should click on Aboutus link")
	public void user_should_click_on_aboutus_link() {
		//DriverManager.getDriver().findElement(By.linkText("About Ciklum")).click();
		
		CiklumAboutusPage.aboutUslinkclick.click();
	}

}
