package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue={"stepDefinition"}, 
plugin= {"pretty","html:target/Destination/cucumber-reports", "json:target/cucumber.json"},
monochrome=true)


public class RunnerClass {
	
	
	
}
