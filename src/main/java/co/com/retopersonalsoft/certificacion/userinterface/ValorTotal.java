package co.com.retopersonalsoft.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValorTotal {

    public static Target VALOR_TOTAL_JAVA=Target.the("label cuadro del pedido").located(By.xpath("(//td[4])[6]"));
    public static Target VALOR_TOTAL_RUBY=Target.the("label cuadro del pedido").located(By.xpath("(//td[4])[7]"));
    public static Target VALOR_TOTAL_PYTHON=Target.the("label cuadro del pedido").located(By.xpath("(//td[4])[8]"));
    public static Target VALOR_TOTAL=Target.the("label cuadro del pedido").located(By.xpath("//*[@id='total']"));

}

