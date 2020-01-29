package co.com.retopersonalsoft.certificacion.stepdefinitions;

import co.com.retopersonalsoft.certificacion.GeneralStepDefinitions;
import co.com.retopersonalsoft.certificacion.questions.VaidateTarget;
import co.com.retopersonalsoft.certificacion.questions.ValidarValorTotal;
import co.com.retopersonalsoft.certificacion.tasks.PaginaPrincipal;
import co.com.retopersonalsoft.certificacion.tasks.RealizarCierreDeSesion;
import co.com.retopersonalsoft.certificacion.tasks.RealizarLoguin;
import co.com.retopersonalsoft.certificacion.tasks.RealizarPedido;
import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import co.com.retopersonalsoft.certificacion.utilidades.Constantes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarProductos extends GeneralStepDefinitions {

    //Escenario numero 1
    @Given("^loguearme en la pagina de sahitest$")
    public void loguearmeEnLaPaginaDeSahitest(List<Map<String,String>> credenciales) {
        setUp(Constantes.URL_PUNTO2);
        theActorInTheSpotlight().attemptsTo(RealizarLoguin.conCredenciales(credenciales.get(0).get("user"),credenciales.get(0).get("password")));
    }



    @Then("^ingresar numero de elementos, dar clic en agregar y se valida la existencia de los productos$")
    public void ingresarNumeroDeElementosDarClicEnAgregarYSeValidaLaExistenciaDeLosProductos(List<Map<String,String>> cantidadIngresada) {
        theActorInTheSpotlight().attemptsTo(RealizarPedido.seleccionarOpciones(cantidadIngresada.get(0).get("java"),cantidadIngresada.get(0).get("ruby"),cantidadIngresada.get(0).get("python")));
    }


    //Escenario numero 2
    @Then("^Se valida si la cantida porel precio unitario de todos los productos es igual al Grand Total$")
    public void seValidaSiLaCantidaPorelPrecioUnitarioDeTodosLosProductosEsIgualAlGrandTotal() {
        theActorInTheSpotlight().should(seeThat((ValidarValorTotal.conValor())));
    }

    //Escenario numero 2
    @When("^dar clic en logout$")
    public void darClicEnLogout() {
        theActorInTheSpotlight().attemptsTo(RealizarCierreDeSesion.Con());

    }

    @Then("^Se puede visulalizar la pagina de loguin$")
    public void sePuedeVisulalizarLaPaginaDeLoguin() {
        theActorInTheSpotlight().should(seeThat(VaidateTarget.attach("Sahi Training Site", PaginaPpal.LBL_TITULO)));
    }

}
