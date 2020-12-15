package com.ishatrainingsolutions.mobiletests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        strict =true,
        monochrome = true,
        features = "classpath:features",
        glue={"com.ishatrainingsolutions.mobiletests.steps"},
        plugin = {("json:target/cucumber-reports/cucumberTestReport.json"),("timeline:target/cucumber-reports/timeLine.json")
        ,("html:target/cucumber-reports/cucumberTestReport.html")},
        dryRun = false
)
public class RunnerTest extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
            return super.scenarios();
        }

    }

