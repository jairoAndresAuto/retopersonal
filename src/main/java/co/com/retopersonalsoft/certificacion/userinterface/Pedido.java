package co.com.retopersonalsoft.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pedido {

    public static Target LBL_PEDIDO=Target.the("label cuadro del pedido").located(By.xpath("(//h2)[1]"));
    public static Target TXT_VALORES_JAVA=Target.the("label cuadro del pedido").located(By.xpath("(//input)[1]"));
    public static Target TXT_VALORES_RUBY=Target.the("label cuadro del pedido").located(By.xpath("(//input)[2]"));
    public static Target TXT_VALORES_PYTHON=Target.the("label cuadro del pedido").located(By.xpath("(//input)[3]"));
    public static Target TXT_INVENTARIO_JAVA=Target.the("label cuadro del pedido").located(By.xpath("(//td[2])[2]"));
    public static Target TXT_INVENTARIO_RUBY=Target.the("label cuadro del pedido").located(By.xpath("(//td[2])[3]"));
    public static Target TXT_INVENTARIO_PYTHON=Target.the("label cuadro del pedido").located(By.xpath("(//td[2])[4]"));
    public static Target BTN_ADD=Target.the("label cuadro del pedido").located(By.xpath("(//input)[4]"));
}
