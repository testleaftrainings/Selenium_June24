package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(//features = {"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature" },
					features ="src/test/java/features",
				 glue={"stepDefinition","hooks"},
				 publish = true,
				 monochrome = true,
				 tags = "@Login or @Positive")
public class Runner extends AbstractTestNGCucumberTests {

}
