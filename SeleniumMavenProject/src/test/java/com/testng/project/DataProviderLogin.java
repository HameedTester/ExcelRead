package com.testng.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLogin {
	
	@Test(dataProvider = "getData")
	public void facebookLogin(String username, String password)
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement userText = driver.findElement(By.name("email"));
		userText.sendKeys(username);

		WebElement passText = driver.findElement(By.name("pass"));
		passText.sendKeys(password);


		WebElement buttonLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		buttonLogin.click();
		
		
	}
	
	
	@DataProvider
	public Object getData()
	{
		
		
		
		Object a[][]= new Object[4][2];
		
		a[0][0]="oranium";
		a[0][1]="pass";
		
		a[1][0]="selenium";
		a[1][1]="12345";
		
		a[2][0]="java";
		a[2][1]="11234";
		
		a[3][0]="chrompet";
		a[3][1]="@!#$";
		
		return a;
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
