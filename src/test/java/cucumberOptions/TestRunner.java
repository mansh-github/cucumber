package cucumberOptions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/test/java/features",
		  glue = "stepDefinations",
		  dryRun = false,
		  monochrome = true,
		  plugin = {
				  "pretty",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		/*
		 * "json:target/cucumber-report/cucumber.json",
		 * "html:target/cucumber-report/cucumber.html"
		 */
                 }
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
