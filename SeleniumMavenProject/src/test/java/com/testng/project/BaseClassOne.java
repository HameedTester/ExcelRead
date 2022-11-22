package com.testng.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassOne {
	
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void browserLaunch()
	{
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

	}
	
	
	@AfterMethod
	public void browserClose()
	{
		
		
		driver.close();
		
	}

}
