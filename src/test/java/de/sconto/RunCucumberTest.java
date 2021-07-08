package de.sconto;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"},
                            //glue = "de.sconto",
                            features =  "src/test/resources/de/de.sconto",
                            tags = "@correctLogin",
                            // tags = "@wrongLogin",
                            strict = true)

public class RunCucumberTest {

}
