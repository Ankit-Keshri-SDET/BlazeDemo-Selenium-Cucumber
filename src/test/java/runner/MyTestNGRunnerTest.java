package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions", "hooks", "factory", "customeType", "domainObjects"},
        plugin = {
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "pretty:target/cucumber-reports/cucumber-pretty.txt"
        },
        monochrome = true
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {
}
