package co.com.retopersonalsoft.certificacion.tasks;

import co.com.retopersonalsoft.certificacion.userinterface.PaginaPpal;
import co.com.retopersonalsoft.certificacion.userinterface.Pedido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarPedido implements Task {

    private String java;
    private String ruby;
    private String python;

    public RealizarPedido(String java, String ruby, String python) {
        this.java = java;
        this.ruby = ruby;
        this.python = python;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (((Integer.parseInt(java))<=(Integer.parseInt(Pedido.TXT_INVENTARIO_JAVA.resolveFor(actor).getText())))&&
                ((Integer.parseInt(ruby))<=(Integer.parseInt(Pedido.TXT_INVENTARIO_RUBY.resolveFor(actor).getText())))&&
                ((Integer.parseInt(python))<=(Integer.parseInt(Pedido.TXT_INVENTARIO_PYTHON.resolveFor(actor).getText())))){
                         actor.attemptsTo(WaitUntil.the(Pedido.LBL_PEDIDO, isVisible()),
                    Enter.theValue(java).into(Pedido.TXT_VALORES_JAVA),
                    Enter.theValue(ruby).into(Pedido.TXT_VALORES_RUBY),
                    Enter.theValue(python).into(Pedido.TXT_VALORES_PYTHON),
                    Click.on(Pedido.BTN_ADD));
        }else{
            System.out.println("No contamos con la cantidad solicitada");
        }

    }

    public static RealizarPedido seleccionarOpciones(String java,String ruby,String python){
        return Tasks.instrumented(RealizarPedido.class,java,ruby,python);
    }
}
