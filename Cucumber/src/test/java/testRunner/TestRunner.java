package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature\\sample.feature",
glue= {"stepDefinition"},
plugin={"pretty","html:target/Destination.HTML"},
monochrome = true


		)

public class TestRunner {

}
