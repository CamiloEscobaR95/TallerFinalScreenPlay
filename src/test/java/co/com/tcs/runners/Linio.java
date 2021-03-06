package co.com.tcs.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src\\test\\resources\\features\\registro_datos.feature",
        glue = "co.com.tcs.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class Linio {
}
