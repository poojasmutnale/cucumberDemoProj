package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", 
		glue = { "StepDefinitions" }, 
		monochrome = true, 
		plugin = {
		"pretty", 
		"summary",
		"junit:target/JUNITReports/report.xml", 
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html"}, 
		tags = "@smoketest")
public class TestRunner {

}


