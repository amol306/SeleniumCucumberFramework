package StepDefs;

import org.junit.runner.*;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginDemoCMD.feature", glue = "StepDefs", monochrome = true, plugin = {
		"pretty", "html:target/HTMLReports/report.html", "json:target/JsonReports/report.json",
		"junit:target/JunitReports/report.xml" })
public class TestRunnerCMD {

}
