package seleniumMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//		driver.get("https://www.facebook.com/");
		//		
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		
		//		//driver.manage().window().maximize();
		//		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//		
		//		WebElement userText = driver.findElement(By.id("email"));
		//	
		//		js.executeScript("document.getElementById('email').value='oranium@gmail.com'");
		//		
		//		
		//		WebElement passText = driver.findElement(By.id("pass"));
		//		
		//		js.executeScript("document.getElementById('pass').value='pass@123'");
		//		
		//		
		//		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		//		
		//		js.executeScript("arguments[0].click();",loginButton);
		//		


		driver.get("https://letcode.in/waits");

		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.id("accept"));
		alert.click();
		//		
		//		Alert a = driver.switchTo().alert();
		//		
		//		a.accept();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.accept();

	}

}
