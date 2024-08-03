package runner;

import hooks.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature",
				glue="stepDefinition",
				publish =true,
				monochrome= true)
public class LoginRunner extends ProjectSpecificMethod {

}
