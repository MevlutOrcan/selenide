package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = "@testCases",
        dryRun = false


)
public class Runner {
}