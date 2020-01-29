package co.com.retopersonalsoft.certificacion.questions;

import co.com.retopersonalsoft.certificacion.userinterface.ValorTotal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarValorTotal implements Question<Boolean>{

    Integer valor_java;
    Integer valor_ruby;
    Integer valor_python;
    Integer suma;

    public Integer sumar(Actor actor) {
        valor_java= Integer.parseInt(ValorTotal.VALOR_TOTAL_JAVA.resolveFor(actor).getText().replace("Rs.",""));
        valor_ruby= Integer.parseInt(ValorTotal.VALOR_TOTAL_RUBY.resolveFor(actor).getText().replace("Rs.",""));
        valor_python= Integer.parseInt(ValorTotal.VALOR_TOTAL_PYTHON.resolveFor(actor).getText().replace("Rs.",""));
        return suma=valor_java+valor_ruby+valor_python;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
       Integer valor_total= sumar(actor);
       if(valor_total==2750) {
           return true;
       }
       return false;
    }

    public static ValidarValorTotal conValor() {
        return new ValidarValorTotal();
    }
}
