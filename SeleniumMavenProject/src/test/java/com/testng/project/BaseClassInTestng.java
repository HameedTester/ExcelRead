package com.testng.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassInTestng {
	
	
	
public static WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch()
	{

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		

		System.out.println("Browser Starts to Launch from Here");

	}
	
	@AfterMethod
	public void closeBrowser()
	{


		driver.close();

		System.out.println("Close the Browser");


	}


}
