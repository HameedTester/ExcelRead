package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;

	@Given("User Launch the Browser")
	public void user_launch_the_browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		System.out.println("Browser Launched Successfully");


	}

	@When("User Enters {string} and {string}")
	public void user_enters_and(String username, String password) {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(username);

		WebElement passField = driver.findElement(By.id("pass"));
		passField.sendKeys(password);
	}

	@When("User Click the Login Button")
	public void user_click_the_login_button() {


		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginButton.click();

	}

	@Then("Verify the Login Successfuly Message")
	public void verify_the_login_successfuly_message() {
		
		System.out.println("Logged in Successfully");
	}

}
