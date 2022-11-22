package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

//	WebDriver driver;
//
//	@Given("User launch the Browser")
//	public void user_launch_the_browser() {
//
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver();
//
//		driver.get("https://www.facebook.com");
//		
//		System.out.println("Launch the URL Successfully");
//	}
//
//	@When("User Enters the {string} and {string}")
//	public void user_enters_the_and(String username, String password) {
//
//		WebElement textBox = driver.findElement(By.id("email"));
//		textBox.sendKeys(username);
//
//		WebElement passBox = driver.findElement(By.id("pass"));
//		passBox.sendKeys(password);
//	}
//
//	@When("User click the Login Button")
//	public void user_click_the_login_button() {
//
//		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
//		button.click();
//	}
//
//	@Then("User validate the outcomes")
//	public void user_validate_the_outcomes() {
//		
//		System.out.println("Verified the Output Successfully");
//	}
	WebDriver driver;
	
	@Given("^User launch the Browser$")
    public void user_launch_the_browser()  {
		
		WebDriverManager.chromedriver().setup();
		
				driver = new ChromeDriver();
		
				driver.get("https://www.facebook.com");
				
				System.out.println("Launch the URL Successfully");
    }

    @When("^User Enters the (.+) and (.+)$")
    public void user_enters_the_and(String username, String password)  {
    	
    	WebElement textBox = driver.findElement(By.id("email"));
		textBox.sendKeys(username);

		WebElement passBox = driver.findElement(By.id("pass"));
		passBox.sendKeys(password);
	}
    

   

    @And("^User click the Login Button$")
    public void user_click_the_login_button()  {
    	
    	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
    }

    @Then("^User validate the outcomes$")
    public void user_validate_the_outcomes() {
    	
    	System.out.println("Verified the Output Successfully");
    }

    
    
    @Before
    public void beforeBrowserLaunch()
    {
    System.out.println("Before Launched Successfully");	
    	
    }
    
    
    @After
    public void afterBrowserLaunch()
    {
    	
    	System.out.println("Output Verified Successfully");
    }
    
    
    
    

}
