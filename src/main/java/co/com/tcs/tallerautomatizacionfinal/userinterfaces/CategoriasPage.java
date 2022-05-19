package co.com.tcs.tallerautomatizacionfinal.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CategoriasPage {

    public static final Target BOTON_HOGAR = Target.the("boton de hogar").located(By.xpath("//*[@id=\"main-menu\"]/nav/ul/li[8]/a"));
    public static final Target COLCHONES = Target.the("boton de colchones").located(By.xpath("//*[@id=\"main-menu\"]/div/div[8]/div[1]/div/div[2]/a[2]"));
}
