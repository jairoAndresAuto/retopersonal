package co.com.retopersonalsoft.certificacion.tasks;

import co.com.retopersonalsoft.certificacion.userinterface.Loguin;
import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarLoguin implements Task {

    private String user;
    private String clave;

    public RealizarLoguin(String user, String clave) {
        this.user = user;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(Loguin.TXT_USER),
                Enter.theValue(clave).into(Loguin.TXT_CLAVE),
                Click.on(Loguin.BTN_LOGIN));
    }

    public static RealizarLoguin conCredenciales(String user,String clave){
        return Tasks.instrumented(RealizarLoguin.class,user,clave);
    }
}
