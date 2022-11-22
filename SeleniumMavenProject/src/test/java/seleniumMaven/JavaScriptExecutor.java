package seleniumMaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		//		
		//		driver.get("https://www.facebook.com");
		//		driver.manage().window().maximize();
		//		
		//		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//		
		//		WebElement userText = driver.findElement(By.id("email"));
		//		js.executeScript("document.getElementById('email').value='oranium@gmail.com';");
		//		
		//		WebElement passWord = driver.findElement(By.id("pass"));
		//		js.executeScript("document.getElementById('pass').value='pass@123';");
		//		
		//		
		//		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		//		js.executeScript("arguments[0].click();",loginButton);



//		driver.get("https://letcode.in/frame");
//		driver.manage().window().maximize();
//
//		driver.switchTo().frame(0);
//
//
//		WebElement firstName = driver.findElement(By.name("fname"));
//		firstName.sendKeys("oranium");
//
//
//		WebElement lastName = driver.findElement(By.name("lname"));
//		lastName.sendKeys("tech chrompet");
//
//		driver.switchTo().frame(0);
//
//
//		WebElement email = driver.findElement(By.name("email"));
//		email.sendKeys("oranium@gmail.com");
//
//		//		driver.switchTo().parentFrame();
//		//		
//		//		WebElement lastName1 = driver.findElement(By.name("lname"));
//		//		lastName1.clear();
//		//		lastName1.sendKeys("velachery");
//
//
//		driver.switchTo().defaultContent();
//
//
//		WebElement link = driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
//		link.click();
	
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	
	WebElement button = driver.findElement(By.id("tabButton"));
	button.click();
	
	Set<String> allWindows = driver.getWindowHandles();
	System.out.println(allWindows);
	
	
//	List<String> l = new ArrayList<>(allWindows);
//	
//	driver.switchTo().window(l.get(1));
//	
//	
//	WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
//	String text2 = text.getText();
//	System.out.println(text2);
//	
//	driver.switchTo().window(l.get(0));
	
//	for (String child : allWindows) {
//		
//		
//		if(!parentWindow.equals(child))
//		{
//			
//			driver.switchTo().window(child);
//			WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
//			String text2 = text.getText();
//			System.out.println(text2);
//			
//		}
//		
//		
//		
//		
//	}
//	
//	driver.switchTo().window(parentWindow);
	
	int count =0;
	
	for (String child : allWindows) {
		
		
		if(count==1) //0==1 /1==1
		{
			
			driver.switchTo().window(child);
			
			WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
			String text2 = text.getText();
			System.out.println(text2);
			
			
		}
		
		count++; //0->1
		
		
	}
	
	
	}

	
	
}