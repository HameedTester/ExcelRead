package com.testng.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClass {



	@Test
	public void FacebookLogin()
	{


		WebElement userText = driver.findElement(By.name("email"));
		userText.sendKeys("oranium@gmail.com");

		WebElement passText = driver.findElement(By.name("pass"));
		passText.sendKeys("pass");


		WebElement buttonLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		buttonLogin.click();



	}

}