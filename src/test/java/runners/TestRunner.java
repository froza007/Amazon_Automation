package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {
                "stepDefinitions",
            // include if you created Hooks class
        },

        plugin = {

                "pretty",

                // HTML Report
                "html:reports/cucumber-reports/report.html",

                // JSON Report (Jenkins + advanced reporting)
                "json:target/cucumber.json",

                // Console output formatting
                "summary"

        },

        monochrome = true
        

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
