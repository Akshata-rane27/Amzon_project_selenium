package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"StepDefination"},
    plugin = {"pretty", "junit:target/junitreport.xml",
              "html:target/htmlreport",
              "json:target/jsonreport.json"}
)
public class TestRunner {
}

