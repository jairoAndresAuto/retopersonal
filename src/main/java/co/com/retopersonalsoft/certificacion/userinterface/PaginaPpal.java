package co.com.retopersonalsoft.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPpal {

    public static Target LBL_TITULO=Target.the("Titulo pagina").located(By.xpath("//*[contains(text(),'Sahi')][1]"));
    public static Target BTN_OPCION1=Target.the("BOTON OPCION 1").located(By.xpath("//a[contains(text(),'IFrames')]"));
    public static IFrame I_FRMAE2=IFrame.withPath(By.xpath("(//iframe)[2]"));
    public static Target BTN_OPCION2=Target.the("BOTON OPCION 2").inIFrame(I_FRMAE2).located(By.xpath("//a[contains(text(),'Error Pages')]"));
    public static Target BTN_OPCION3=Target.the("BOTON OPCION 3").inIFrame(I_FRMAE2).located(By.xpath("//a[contains(text(),'404 Page')]"));
    public static Target LBL_DESCRIPCION=Target.the("Descripcion de error").inIFrame(I_FRMAE2).located(By.xpath("//p"));


}
