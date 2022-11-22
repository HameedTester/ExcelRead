package seleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		//		driver.get("https://www.amazon.in/");
		//		driver.manage().window().maximize();
		//		
		//		WebElement ac = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		//		Actions a = new Actions(driver);
		//		a.moveToElement(ac).perform();
		//		
		//		WebElement link = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		//		link.click();

		driver.get("https://www.yatra.com/flights");

		driver.manage().window().maximize();
		
		
		WebElement moreOption = driver.findElement(By.xpath("//span[text()='+ More']"));
		Actions a = new Actions(driver);
		a.moveToElement(moreOption).perform();
		
		WebElement trains = driver.findElement(By.xpath("//span[text()='Trains']"));
//		a.contextClick(trains).build().perform();
//		a.doubleClick();
		a.click(trains).build().perform();
		


	}

}
