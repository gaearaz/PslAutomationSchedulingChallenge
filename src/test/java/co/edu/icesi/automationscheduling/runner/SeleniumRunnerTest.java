package co.edu.icesi.seleniumworkshop.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "co.edu.icesi.automationscheduling.steps",
        features = "classpath:features/automatizacion.herokuapp.feature"
)
public class SeleniumRunnerTest {
}
