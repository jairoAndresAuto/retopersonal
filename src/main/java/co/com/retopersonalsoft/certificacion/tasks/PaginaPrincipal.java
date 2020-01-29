package co.com.retopersonalsoft.certificacion.tasks;

import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PaginaPrincipal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(PaginaPpal.BTN_OPCION1),
        WaitUntil.the(PaginaPpal.BTN_OPCION2, isVisible()),
        Scroll.to(PaginaPpal.BTN_OPCION2),
        Click.on(PaginaPpal.BTN_OPCION2),
        Click.on(PaginaPpal.BTN_OPCION3),
        WaitUntil.the(PaginaPpal.LBL_DESCRIPCION, isVisible()));
    }

    public static PaginaPrincipal seleccionarOpciones(){
        return Tasks.instrumented(PaginaPrincipal.class);
    }
}
