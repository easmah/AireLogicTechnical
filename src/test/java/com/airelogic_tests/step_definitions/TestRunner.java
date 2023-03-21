package com.airelogic_tests.step_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/airelogic_tests/resources/",
        glue = {"com.airelogic_tests.step_definitions"}, tags="not @ignore", monochrome = true,
        plugin = {"pretty", "html:src/test/reports/HtmlReports.html","json:src/test/reports/cucumber.json"})

public class TestRunner {
}
