package seleniumMaven;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
//		
//		
//		WebElement userText = driver.findElement(By.id("email"));
//		userText.sendKeys("oranium");
//		
//		WebElement passText = driver.findElement(By.name("pass"));
//		passText.sendKeys("pass123");
//		
//		
//		
//		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		button.click();
//		
		
		
		// Syntax to take screenshot
		
		
//		
//		TakesScreenshot tk =((TakesScreenshot)driver); 
//		
//		
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		
//		File des = new File ("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumMavenProject\\screenshot\\image.png");
//		FileUtils.copyFile(src, des);
		
		
		
//		driver.get("https://demo.automationtesting.in/Register.html");
//		
//		driver.manage().window().maximize();
//		
////		WebElement MaleRadio = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
////		MaleRadio.click();
//		
//		boolean selected = MaleRadio.isSelected();
//		System.out.println(selected); //true
//		
//		Thread.sleep(3000);// it will hold the execution for 3sec
//		
//		WebElement FemaleRadio = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
//		FemaleRadio.click();
//		
//		
//		WebElement MaleRadio1 = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
//	
//		
//		boolean selected2 = MaleRadio1.isSelected();
//		System.out.println(selected2);
		
		
		
//		WebElement checkBox2 = driver.findElement(By.id("checkbox2"));
//		checkBox2.click();
//		
//		WebElement checkBox1 = driver.findElement(By.id("checkbox1"));
//		checkBox1.click();
//		
//		WebElement checkBox3 = driver.findElement(By.id("checkbox3"));
//		checkBox3.click();
//		
//		checkBox1.click();
//		
//		checkBox2.click();
//		
//		checkBox3.click();
//		
//		
//		boolean vijay = checkBox3.isSelected();
//		System.out.println(vijay);
		
		
//		driver.get("https://www.google.co.in/");
//		
//		driver.manage().window().maximize();
//		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		int size = links.size();
//		System.out.println(size);
//		
//		
//		for (WebElement allLinks : links) {
//			System.out.println(allLinks.getText());
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
