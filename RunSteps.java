package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feauture/AllLead.feature", glue="TestSteps", monochrome = true)

//@CucumberOptions(features="src/test/java/feauture/DeleteLead.feature", glue="TestSteps", monochrome = true)

//@CucumberOptions(features="src/test/java/feauture/EditLead.feature", glue="TestSteps", monochrome = true)

//@CucumberOptions(features="src/test/java/feauture/DuplicateLead.feature", glue="TestSteps", monochrome = true)

//@CucumberOptions(features="src/test/java/feauture/MergeLead.feature", glue="TestSteps", monochrome = true)

public class RunSteps extends AbstractTestNGCucumberTests {

}
