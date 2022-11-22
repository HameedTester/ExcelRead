package seleniumMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandlingInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//		driver.get("https://money.rediff.com/gainers");
		//		
		//		driver.manage().window().maximize();
		//		
		//		
		//		WebElement thead = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[3]"));
		//		String text = thead.getText();
		//		System.out.println(text);
		//		
		//		
		////		List<WebElement> header = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		////		
		////		
		////		for (WebElement webElement : header) {
		////			
		////			System.out.println(webElement.getText());
		////		}
		//
		//
		//		List<WebElement> company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		//		
		//		
		////		for (int i = 0; i < company.size(); i++) {
		////			
		////			System.out.println(company.get(i).getText());
		////			
		////		}
		////		
		//		
		//		List<WebElement> price = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));
		//		
		//		
		//		for(int i=0; i<company.size();i++)
		//		{
		//			
		//			
		//			if(company.get(i).getText().equalsIgnoreCase("GLOBAL Health"))
		//			{
		//				
		//				
		//				System.out.println(price.get(i).getText());
		//			}
		//			

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		
		WebElement Hello = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));

		
		Actions a = new Actions(driver);
		
		a.moveToElement(Hello).build().perform();
		
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		
		a.contextClick(findElement).build().perform();
		
		
		
		
		
		
	}

}


