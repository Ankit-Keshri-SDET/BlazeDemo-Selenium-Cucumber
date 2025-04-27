package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/Forgot_Password.feature"},
        glue = {"stepDefinitions", "hooks", "factory", "customeType", "domainObjects"},
        plugin = {"html:target/cucumber-reports/cucumber.html"
                , "json:target/cucumber-dry.json", "pretty:target/cucumber-pretty-dry.txt"},
        monochrome = true
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {
}
