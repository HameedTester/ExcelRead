package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromdriver.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumFirstProjectUsingJava\\driver\\chromedriver.exe");
		// to launch the Browser with blank url we do have a syntax
		
		WebDriver driver = new ChromeDriver();// it will launch the blank url 
		
	}

}
