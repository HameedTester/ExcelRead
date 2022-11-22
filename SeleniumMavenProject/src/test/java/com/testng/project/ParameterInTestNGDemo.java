package com.testng.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterInTestNGDemo {

	@Test
	@Parameters({"email","pass"})
	public void faceBookLogin(String username, String password)
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


}
