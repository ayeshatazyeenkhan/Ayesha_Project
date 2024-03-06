package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Fb_loginpage;
import com.utilities.utilities;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Opencardscenario1 extends utilities {
  @Test
  public void f() {
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("open_qa_url");
	  Fb_loginpage locator = new Fb_loginpage();
	  sendKeysByAnyLocator(locator.OpenQA_search_EditBox, "search_data");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
