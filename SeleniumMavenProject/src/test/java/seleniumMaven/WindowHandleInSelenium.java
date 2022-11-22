package seleniumMaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


//		driver.get("https://demoqa.com/browser-windows");
//
//		driver.manage().window().maximize();
//
//		String parentWindow = driver.getWindowHandle();// Main Window
//
//		WebElement button = driver.findElement(By.xpath("//button[text()='New Tab']"));
//		button.click();
//
//		Set<String> allWindows = driver.getWindowHandles();

		// way 1 converting Set into List

		//		List<String> l = new ArrayList<String>(allWindows);
		//
		//		driver.switchTo().window(l.get(1));
		//
		//		WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		//		String text2 = text.getText();
		//		System.out.println(text2);
		//
		//
		//		driver.switchTo().window(l.get(0));


		//Using Enhanced For Loop

//		for (String child : allWindows) {
//
//
//			if(!parentWindow.equals(child))
//			{
//
//
//				driver.switchTo().window(child);
//
//				WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
//				String text2 = text.getText();
//				System.out.println(text2);
//
//
//
//			}
//			
//			
//
//
//
//		}
//
//
//		driver.switchTo().window(parentWindow);
		
		
		// 3rd Way to swith window using count()
		
		
		
//		int count=0;
//		
//		
//		for (String child : allWindows) {
//			
//			
//			if(count==1) //0==1 / 1==1
//			{
//				
//				driver.switchTo().window(child);
//				WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
//				String text2 = text.getText();
//				System.out.println(text2);
//				
//			}
//			
//			count++;
//			
//		}
//		
//		
//		driver.switchTo().window(parentWindow);
//		
		
		
		
	driver.get("https://letcode.in/dropdowns");
	
	driver.manage().window().maximize();
	
//	WebElement dropDown = driver.findElement(By.id("fruits"));
//		
//	//Syntax for Select Class
//	
//	Select s = new Select(dropDown);
	
//	s.selectByIndex(1);//Apple
//	
//	s.selectByIndex(5);//pinapple
	
//	s.selectByVisibleText("Orange");
//	
//	s.selectByVisibleText("Banana");

	
	//multi select dropdown
	
	
	
	WebElement multiDrop = driver.findElement(By.id("superheros"));
	
	Select s = new Select(multiDrop);
	
	
	s.selectByIndex(0);
	s.selectByIndex(2);
	s.selectByIndex(4);
	s.selectByIndex(6);
	
	s.deselectByIndex(6);
	s.deselectByIndex(4);
	
	s.deselectByIndex(0);
	
	
	
	List<WebElement> options = s.getOptions();
	
	
	for (WebElement webElement : options) {
		
		
		System.out.println(webElement.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
