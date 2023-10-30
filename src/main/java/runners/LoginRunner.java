package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@SmokeTest", features = "src/main/java/features/Login.feature", glue = "stepsDef",
        plugin = {})

public class LoginRunner {

}

