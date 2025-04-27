package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/E2E_DataDriven.feature",
                    "src/test/resources/features/E2E_Flow.feature"},
        glue = {"stepDefinitions", "hooks", "factory", "customeType", "domainObjects"},
        plugin = {"html:target/cucumber-reports/cucumber.html"
                , "json:target/cucumber-dry.json", "pretty:target/cucumber-pretty-dry.txt"},
        monochrome = true
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {
}
