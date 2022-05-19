package co.com.tcs.tallerautomatizacionfinal.tasks;

import co.com.tcs.tallerautomatizacionfinal.userinterfaces.CategoriasPage;
import co.com.tcs.tallerautomatizacionfinal.userinterfaces.LinioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class Buscar implements Task {


    public static Buscar Categoria(){
        return Tasks.instrumented(Buscar.class);
    }



    @Override
    public <T extends Actor> void  performAs (T actor){
        actor.attemptsTo(Click.on(LinioPage.BOTON_CATEGORIA));
        //actor.attemptsTo(Click.on(CategoriasPage.BOTON_HOGAR));
        //actor.attemptsTo(Click.on(CategoriasPage.COLCHONES));
    }

}



