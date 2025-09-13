package com.creatio.crm.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BasePage {

	// This class can be used to define common properties and methods for all pages
	// in the application.

	
	public static WebDriver driver=null;
	
	@BeforeMethod (alwaysRun = true)
	@Parameters ("BROWSER")
	public void WebDriver (String browserName)
	{
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}else {
			System.out.println("Browser not supported "+browserName);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	//method to close browser
	
	@AfterMethod (alwaysRun = true)
	public void teardownBrowser() {
		if (driver!=null)
		{
			driver.quit();
		}
	}
	
	//method to get driver
	 public static WebDriver getDriver()
	{
		return driver;
	}
	 
	// method to set driver
	 
	 public static void setDriver(WebDriver driver) 
	 {
		 BasePage.driver=driver;
	 }
}