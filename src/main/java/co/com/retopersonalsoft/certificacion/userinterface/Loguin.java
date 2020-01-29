package co.com.retopersonalsoft.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Loguin {

    public static Target TXT_USER=Target.the("Ingresar user").located(By.name("user"));
    public static Target TXT_CLAVE=Target.the("Ingresar clave").located(By.name("password"));
    public static Target BTN_LOGIN=Target.the("Ingresar clave").located(By.className("button"));

}
