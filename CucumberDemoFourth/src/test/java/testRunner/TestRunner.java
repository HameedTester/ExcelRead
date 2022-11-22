package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


		features = "src\\test\\java\\feature\\cucumberproject.feature",
		glue= {"stepDefinition"},
		monochrome = true,
		plugin= {"pretty","html:target/Destination.HTML"}

		)

public class TestRunner {

	
	
}
