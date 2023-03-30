package com.teledocHealth.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },
        features = "src/test/resources/features",
        glue = "com/teledocHealth/stepsDefinitions",
        tags = "@Test",
        dryRun = false

)
public class CukesRunner {

}