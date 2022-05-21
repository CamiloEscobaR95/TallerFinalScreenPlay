package co.com.tcs.stepdefinitions;

import co.com.tcs.tallerautomatizacionfinal.interactions.OpenBrowser;
import co.com.tcs.tallerautomatizacionfinal.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LinioStepDefinitions   {

    LinioPage page;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");
    }

    @Given("^El usuario se encuentra en la aplicacion (.*)$")
    public void elUsuarioSeEncuentraEnLaAplicacion(String url) {
        theActorCalled("Camilo").wasAbleTo(OpenBrowser.on(page));
    }

    @When("^El usuario seleccione una categoria$")
    public void elUsuarioSeleccioneUnaCategoria() {
        //theActorCalled("Camilo").wasAbleTo(Buscar.Categoria());
    }

    @Then("^El usuario podra elegir un producto$")
    public void elUsuarioPodraElegirUnProducto() {

    }


}
