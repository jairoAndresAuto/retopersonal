package co.com.retopersonalsoft.certificacion.tasks;

import co.com.retopersonalsoft.certificacion.userinterface.CerrarSesion;
import co.com.retopersonalsoft.certificacion.userinterface.Loguin;
import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import co.com.retopersonalsoft.certificacion.userinterface.Pedido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarCierreDeSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(Pedido.LBL_PEDIDO, isVisible()),
                Click.on(CerrarSesion.BTN_LOGOUT),
                WaitUntil.the(PaginaPpal.LBL_TITULO, isVisible()));
    }

    public static RealizarCierreDeSesion Con(){
        return Tasks.instrumented(RealizarCierreDeSesion.class);
    }
}
