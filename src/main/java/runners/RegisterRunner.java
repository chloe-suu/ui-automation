package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@SmokeTest", 
		features = "src/main/java/features/Register.feature", 
		glue = "stepsDef", 
		plugin = {"pretty", "json:TestReports/report1.json", "junit:TestReports/report2.xml" ,"html:TestReports/report3.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		publish = true)

public class RegisterRunner {

}
