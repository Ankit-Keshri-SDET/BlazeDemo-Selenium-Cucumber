package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features/E2E_Flow.feature"},
        glue = {"stepDefinitions", "hooks", "factory", "customeType", "domainObjects"},
        plugin = {
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber.json",
                "pretty:target/cucumber-reports/cucumber-pretty.txt"
        },
        tags = "@Regression",
        monochrome = true
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
