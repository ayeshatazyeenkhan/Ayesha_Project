package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Fb_loginpage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

	// Locators = new locators();
	@Test
	public void f() {
		Fb_loginpage  locator = new Fb_loginpage();

		driver.findElement(locator.Fb_loginpage_Email_EditBox).sendKeys("kubramatin@yahoo.com");
		driver.findElement(locator.Fb_loginpage_Password_EditBox).sendKeys("12345600");
		//driver.findElement(locator.Fb_loginpage_Button).click();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
