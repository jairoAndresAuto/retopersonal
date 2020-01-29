package co.com.retopersonalsoft.certificacion.stepdefinitions;

import co.com.retopersonalsoft.certificacion.GeneralStepDefinitions;
import co.com.retopersonalsoft.certificacion.questions.VaidateTarget;
import co.com.retopersonalsoft.certificacion.tasks.PaginaPrincipal;
import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import co.com.retopersonalsoft.certificacion.utilidades.Constantes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import java.util.Map;

public class SeleccionarDelMenu extends GeneralStepDefinitions {

    @Given("^Despues de encontrarme en la pagina de sahitest$")
    public void despuesDeEncontrarmeEnLaPaginaDeSahitest() {
     setUp(Constantes.URL_PUNTO1);
    }


    @When("^elegir opciones hasta la opcion$")
    public void elegirOpcionesHastaLaOpcion() {
        theActorInTheSpotlight().attemptsTo(PaginaPrincipal.seleccionarOpciones());
    }

    @Then("^se visuaza el mensaje de descripcion$")
    public void seVisuazaElMensajeDeDescripcion() {
        theActorInTheSpotlight().should(seeThat(VaidateTarget.attach(Constantes.DESCRIPCION, PaginaPpal.LBL_DESCRIPCION)));
    }

}
