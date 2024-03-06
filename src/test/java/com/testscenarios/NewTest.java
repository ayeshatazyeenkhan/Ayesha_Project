package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Fb_loginpage;
import com.utilities.ReusableFunctions;
import com.utilities.utilities;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.runtime.Runtime.GetPropertiesResponse;
import org.testng.annotations.AfterClass;

public class NewTest extends ReusableFunctions {

	public void chromeBrowserLaunch()
	{
	//System.out.println(chromeBrowserLaunch)()
	}
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
	//Locators = new locators();
	@Test
	public void f() throws Exception {
		
		//creat an object for locator class
	Fb_loginpage locator = new Fb_loginpage();
		//read the test data from properties file
	FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA_TD.Properties");	
		
	Properties p = new Properties();
		p.load(fi);
		
		
       driver.get(p.getProperty("fb_url"));
		driver.findElement(locator.Fb_loginpage_Email_EditBox).sendKeys(p.getProperty("fb_Email"));
		driver.findElement(locator.Fb_loginpage_Password_EditBox).sendKeys(p.getProperty("fb_Password "));
		driver.findElement(locator.Fb_loginpage_Button).click();

	}

	public FileInputStream FileInputStream(String String) {
		// TODO Auto-generated method stub
		return null;
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
