package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\feature\\feature.feature",
		glue= {"stepDefinition"},
		plugin={"pretty","html:target/Destination.html"},
		monochrome = true
		
		
		
		
		
		)







public class TestRun {
	
	
	
	

}
