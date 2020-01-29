package co.com.retopersonalsoft.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CerrarSesion {

    public static Target BTN_LOGOUT=Target.the("label cuadro del pedido").located(By.xpath("(//input)[6]"));
}
