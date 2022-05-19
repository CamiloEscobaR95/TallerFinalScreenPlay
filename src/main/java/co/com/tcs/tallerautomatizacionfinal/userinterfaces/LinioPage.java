package co.com.tcs.tallerautomatizacionfinal.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.linio.com.co/")
public class LinioPage extends PageObject {

    public static final Target BOTON_CATEGORIA = Target.the("boton de categoria").located(By.xpath("//*[@id=\"open-left-menu\"]"));
}
