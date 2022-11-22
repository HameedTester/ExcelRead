package seleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://www.google.co.in/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement link = driver.findElement(By.partialLinkText("Gm"));
//		link.click();
		
//		driver.get("https://demo.automationtesting.in/Register.html");
//		
//		WebElement tagName = driver.findElement(By.tagName("textarea"));
//		tagName.sendKeys("oranium tech chrompet");
//		
//		
//		
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		
//		WebElement userText = driver.findElement(By.cssSelector("input[type=\"text\"]"));
//		userText.sendKeys("oranium@gmail.com");
//		
//		WebElement passText = driver.findElement(By.cssSelector("input#pass"));
//		passText.sendKeys("password");
		
		
		WebElement userText = driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
		userText.sendKeys("oranium");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("password");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginbutton.click();
		
		
		
		
	}

}
