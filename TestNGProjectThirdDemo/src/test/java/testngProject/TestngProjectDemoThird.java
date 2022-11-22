package testngProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngProjectDemoThird {




	@Test(invocationCount = 3)
	public void browserLaunch() // test case
	{

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Browswer Launched Successfully");




	}






}
