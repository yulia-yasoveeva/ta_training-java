package com.epam.training.student_iulia_iasoveeva.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.epam.training.student_iulia_iasoveeva.steps",
                "com.epam.training.student_iulia_iasoveeva.utilities"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}