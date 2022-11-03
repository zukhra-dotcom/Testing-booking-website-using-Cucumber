package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =
        "C://Users//fatiu//Downloads//testng-browserstack-sdk//TestingCucumber//Features//testing.feature",
        glue = "StepDefinitions")
public class TestRunner {

}
