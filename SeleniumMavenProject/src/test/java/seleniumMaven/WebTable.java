package seleniumMaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers");

		driver.manage().window().maximize();

		////table[@class='dataTable']/thead/tr/th[2]


		WebElement thead = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[2]"));

		String text = thead.getText();
		System.out.println(text);


//		List<WebElement> heads = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
//
//
//		for (WebElement webElement : heads) {
//
//			System.out.println(webElement.getText());
//		}

		
		List<WebElement> company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		
		List<WebElement> price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

	
	
		for(int i=0; i<company.size(); i++)
		{
			
			
			if(company.get(i).getText().equalsIgnoreCase("Rita Finance and Lea"));
			
			{
				
				System.out.println(price.get(i).getText());
			}
			
			
			
			
		}
	
	
	
	
	
	}

}
