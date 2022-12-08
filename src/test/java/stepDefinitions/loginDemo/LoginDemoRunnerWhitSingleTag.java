package stepDefinitions.loginDemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:featuresWithTags",
tags = "@strike"
)
public class LoginDemoRunnerWhitSingleTag {

}
