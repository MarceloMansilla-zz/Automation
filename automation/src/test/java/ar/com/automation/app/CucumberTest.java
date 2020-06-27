package ar.com.automation.app;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "ar/com/automation/app/stepdefinitions" }, strict = true, monochrome = true, features = {
		"src/main/resources/features/" })
public class CucumberTest {

}
