package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;



import FileReader.FileReaderManager;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features= "src/test/resource",
		glue={"stepdefs"},
		plugin = {"pretty",
		           "json:target/cucumber-reports/cucumber.json",
		           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					
		},
		monochrome = true,
		publish = true
		)
public class RunCucumberTest {
	
}
