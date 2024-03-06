package com.testscenarios;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class OhgReadTestData {
  @Test
  public void f() {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  FileInputStream fi = new FileInputStream("C:\\Users\\atazy\\Dropbox\\My PC (LAPTOP-508B8E88)\\Desktop\\sinu sir recording 2024_Microsoft Excel Worksheet (.xlsx)");
	  driver.findElement(By.name("username")).sendKeys("ayesha");
	  driver.findElement(By.name("password")).sendKeys("1234");
	  driver.findElement(By.xpath("//button@=[submit']")).click();
  }
}
