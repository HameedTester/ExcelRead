package seleniumMaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPresentInSelenium {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		driver.manage().window().maximize();		
//		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
//		simpleAlert.click();
//		
//		//syntax for alert
//		
//		Alert a = driver.switchTo().alert();
//		
//		String text = a.getText();
//		
//		System.out.println(text);
//		
//		a.accept();
//		
//		Thread.sleep(3000);
//		
//		//confirm Alert
//		
//		WebElement confirmAlert = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
//		confirmAlert.click();
//		
//		WebElement confirm = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
//		confirm.click();
//		
//		Alert a1 = driver.switchTo().alert();
//		
//		a1.dismiss();
//		
//		
//		Thread.sleep(3000);
//		
//		WebElement promptAlert = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
//		promptAlert.click();
//		
//		
//		WebElement prompt = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
//		prompt.click();
//		
//		Alert a2 = driver.switchTo().alert();
//		
//		a2.sendKeys("Oranium Tech Chrompet");
//		
//		a2.accept();
//		
		
		driver.get("https://letcode.in/frame");
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		WebElement userEmail = driver.findElement(By.name("fname"));
		userEmail.sendKeys("oranium chrompet");
		
		
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Oranium velachery");
		
		
		driver.switchTo().frame(0);
		
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("oranium@gmail.com");
		
		
		driver.switchTo().defaultContent();
		
		WebElement mainPage = driver.findElement(By.linkText("Watch tutorial"));
		mainPage.click();
		
		
		
		
		
		
		
	}

}
