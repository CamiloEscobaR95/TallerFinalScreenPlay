package co.com.tcs.tallerautomatizacionfinal.questions;

import co.com.tcs.tallerautomatizacionfinal.userinterfaces.CategoriasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;

public class RespuestaCategoria implements Question<UIStateReaderBuilder<Text>> {

    public static RespuestaCategoria es(){
        return new RespuestaCategoria();
    }

    @Override
    public UIStateReaderBuilder<Text> answeredBy (Actor actor){
        return Text.of(CategoriasPage.BOTON_HOGAR);

    }

}
