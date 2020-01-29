package co.com.retopersonalsoft.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validar_criterios.feature",
        glue = "co.com.retopersonalsoft.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SeleccionarProductosRunners {
}
