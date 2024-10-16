package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:target/TestReport.html"},
        tags = "@smoke"


)
public class TestsRunner extends AbstractTestNGCucumberTests
{

 



}
