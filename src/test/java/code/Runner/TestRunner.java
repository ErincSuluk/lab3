package code.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/test.feature",
        glue="code/StepDefinitions",
        tags = "@TC_2",
        dryRun=false

)


public class TestRunner {


}
