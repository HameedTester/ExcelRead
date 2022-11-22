package seleniumMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//table[@class=\"dataTable\"]"));

		WebElement t1 = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td[1]"));
		String text = t1.getText();
		System.out.println(text);

		//		List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td"));
		//
		//		for (int i = 0; i < row.size(); i++) {
		//
		//			System.out.println(row.get(i).getText());
		//
		//		}


		List<WebElement> companies = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]"));

		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));

		for(int i=0; i<companies.size();i++)
		{
			
			
			if(companies.get(i).getText().equalsIgnoreCase("Promax Power"))
			{
				
				System.out.println(currentPrice.get(i).getText());
			}
		}


	}

}
