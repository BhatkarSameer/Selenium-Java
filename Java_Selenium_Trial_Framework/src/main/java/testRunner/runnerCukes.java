package testRunner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\Java_Selenium Workspace\\Java_Selenium_Trial_Framework\\src\\main\\java\\testRunner\\resources" , glue = "stepDefinitions")
public class runnerCukes {

}