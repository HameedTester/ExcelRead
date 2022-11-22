package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	WebDriver driver;
	
	@Given("User Launch the Browser")
	public void user_launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		System.out.println("Launch the URL Successfully");
	}

	@When("User Enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		
		WebElement textBox = driver.findElement(By.id("email"));
		textBox.sendKeys(username);

		WebElement passBox = driver.findElement(By.id("pass"));
		passBox.sendKeys(password);
	}

	@When("User clicks the Login Button")
	public void user_clicks_the_login_button() {
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	}

	@Then("Verify the Login Page")
	public void verify_the_login_page() {
	}

}
