package seleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProject {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chromedriver.setup","path")
		
		
		WebDriverManager.chromedriver().setup(); // this is help to setup our driver path
		
		WebDriver driver = new ChromeDriver(); // Launch the browser with blank url
		
		
		
		
	}

}
