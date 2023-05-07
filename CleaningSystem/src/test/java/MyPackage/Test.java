package MyPackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Use_Cases",
		glue="MyPackage",
		plugin = {"pretty","html:target/outcucumber.html"}
)

public class Test {

}
